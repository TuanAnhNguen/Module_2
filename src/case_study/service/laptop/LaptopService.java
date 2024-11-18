package case_study.service.laptop;

//import case_study.model.Device;
//import case_study.model.Laptop;
//import case_study.repository.laptop.LaptopRepository;
//
//import java.util.List;
//
//public class LaptopService implements ILaptopService {
//    private final LaptopRepository laptopRepository = new LaptopRepository();
//
//    @Override
//    public List<Device> getAll() {
//        return laptopRepository.getAll();
//    }
//
//    @Override
//    public void add(Device device) {
//        if (device instanceof Laptop) {
//            laptopRepository.add(device);
//        } else {
//            throw new IllegalArgumentException("Laptop không hợp lệ!");
//        }
//    }
//
//    @Override
//    public Laptop findByCode(String code) {
//        return laptopRepository.findByCode(code);
//    }
//
//    @Override
//    public void update(Device device) {
//        if (device instanceof Laptop) {
//            laptopRepository.update(device);
//        } else {
//            throw new IllegalArgumentException("Laptop không hợp lệ!");
//        }
//    }
//
//    @Override
//    public void delete(String code) {
//        laptopRepository.delete(code);
//    }
//}
