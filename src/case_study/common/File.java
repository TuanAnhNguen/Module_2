package case_study.common;

//import case_study.model.Laptop;
//import case_study.model.SmartPhone;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;

//public class File {
//    private static final String PATH_LAPTOP = "src/case_study/data/laptop.csv";
//    private static final String PATH_SMARTPHONE = "src/case_study/data/smartphone.csv";
//
//    public static void writeToLaptopFile(Laptop laptop) {
//        try {
//            FileWriter laptopFileWriter = new FileWriter(PATH_LAPTOP, true);
//            BufferedWriter bufferedWriter = new BufferedWriter(laptopFileWriter);
//            String laptopData = laptop.getCode() + " , " + laptop.getName() + " , " +
//                    laptop.getManufacturer() + " , " + laptop.getYearOfManufacture() + " , " +
//                    laptop.getCpuName() + " , " + laptop.getHardDrive();
//            bufferedWriter.write(laptopData);
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//        }catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static List<Laptop> readLaptopFile() {
//        List<Laptop> laptops = new ArrayList<>();
//        try {
//            FileReader laptopFileReader = new FileReader(PATH_LAPTOP);
//            BufferedReader laptopBufferedReader = new BufferedReader(laptopFileReader);
//            while (true) {
//                String temp = laptopBufferedReader.readLine();
//                if (temp == null) {
//                    break;
//                }
//                String[] arrLaptop = temp.split(",");
//                int year = Integer.parseInt(arrLaptop[3]);
//                laptops.add(new Laptop(arrLaptop[0], arrLaptop[1], arrLaptop[2], year, arrLaptop[4], arrLaptop[5]));
//            }
//        }catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return laptops;
//    }
//
//    public static void writeToSmartPhoneFile(SmartPhone smartPhone) {
//        try {
//            FileWriter smartPhoneFileWriter = new FileWriter(PATH_SMARTPHONE, true);
//            BufferedWriter bufferedWriter = new BufferedWriter(smartPhoneFileWriter);
//            String smartPhoneData = smartPhone.getCode() + " , " + smartPhone.getName() + " , " +
//                    smartPhone.getManufacturer() + " , " + smartPhone.getYearOfManufacture() + " , " +
//                    smartPhone.getOperatingSystem() + " , " + smartPhone.getCapacity();
//            bufferedWriter.write(smartPhoneData);
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static List<SmartPhone> readSmartPhoneFile() {
//        List<SmartPhone> smartPhones = new ArrayList<>();
//        try {
//            FileReader smartPhoneFileReader = new FileReader(PATH_SMARTPHONE);
//            BufferedReader smartPhoneBufferedReader = new BufferedReader(smartPhoneFileReader);
//            while (true) {
//                String temp = smartPhoneBufferedReader.readLine();
//                if (temp == null) {
//                    break;
//                }
//                String[] arrSmartPhone = temp.split(",");
//                int year = Integer.parseInt(arrSmartPhone[3]);
//                int capacity = Integer.parseInt(arrSmartPhone[5]);
//                smartPhones.add(new SmartPhone(arrSmartPhone[0], arrSmartPhone[1], arrSmartPhone[2], year, arrSmartPhone[4], capacity));
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return smartPhones;
//    }
//}
