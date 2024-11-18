package case_study_manager.repository;
import case_study_manager.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class StudentRepository {
    public static final String SRC_STUDENT = "src/case_study_manager/data/student.dat";
//    private static List<Student> students = new ArrayList<>();
//
//    static {
//        students.add(new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724M1"));
//        students.add(new Student(2, "Nguyễn Văn B", "Hà Nội", 10, "C0724M1"));
//        students.add(new Student(3, "Nguyễn Văn C", "Hà Nội", 10, "C0724M1"));
//        students.add(new Student(4, "Nguyễn Văn D", "Hà Nội", 10, "C0724M1"));
//    }

    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        File file = new File(SRC_STUDENT);
//        try {
//            FileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] temp = line.split(",");
//                Student student = new Student(Integer.parseInt(temp[0]), temp[1], temp[2], Double.parseDouble(temp[3]), temp[4]);
//                students.add(student);
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Không tìm thấy file");
//        } catch (IOException e) {
//            System.out.println("Lỗi đọc file");
//        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi không tìm thấy class");
        }
        return students;
    }

    public void save(Student s) {
        List<Student> students = getAll();
        students.add(s);
        writeFileBinary(students);
//        File file = new File(SRC_STUDENT);
//        try {
//            FileWriter fileWriter = new FileWriter(file, true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(s.getCode() + "," + s.getName() + "," + s.getAddress() + "," + s.getPoint() + "," + s.getClassName());
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//        } catch (IOException e) {
//            System.out.println("Lỗi ghi file");
//        }
    }

    public void writeFileBinary(List<Student> students) {
        File file = new File(SRC_STUDENT);
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    public void deleteById(int id) {
        List<Student> students = getAll();
        for (Student student : students) {
            if (student.getCode() == id) {
                students.remove(student);
                break;
            }
        }
        writeFileBinary(students);
    }
}
