package case_study.repository.laptop;

//import case_study.common.File;
//import case_study.model.Device;
//import case_study.model.Laptop;
//
//import java.util.ArrayList;
//import java.util.List;

//public class LaptopRepository implements ILaptopRepository {
//    private static final List<Device> laptops = new ArrayList<>();
//    @Override
//    public List<Device> getAll() {
//        return laptops;
//    }
//
//    @Override
//    public void add(Device device) {
//        if (device != null) {
//            File.writeToLaptopFile((Laptop) device);
//            System.out.println("Thêm mới thành công!");
//        } else {
//            System.out.println("Sản phẩm không hợp lệ!");
//        }
//    }
//
//    @Override
//    public Laptop findByCode(String code) {
//        for (Device device : laptops) {
//            if (device.getCode().equals(code)) {
//                return (Laptop) device;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void update(Device device) {
//        if (device != null) {
//            for (int i = 0; i < laptops.size(); i++) {
//                if (laptops.get(i).getCode().equals(device.getCode())) {
//                    laptops.set(i, device);
//                    System.out.println("Đã cập nhật Laptop!");
//                    break;
//                }
//            }
//            System.out.println("Không tìm thấy Laptop!");
//        }else {
//            System.out.println("Sản phẩm không hợp lệ!");
//        }
//    }
//
//    @Override
//    public void delete(String code) {
//        laptops.removeIf(device -> device.getCode().equals(code));
//        System.out.println("Đã xoá Laptop!");
//    }
//}
