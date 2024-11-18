package case_study.service.smartphone;

//import case_study.model.Device;
//import case_study.model.SmartPhone;
//import case_study.repository.smartphone.SmartPhoneRepository;
//
//import java.util.List;
//
//public class SmartPhoneService implements ISmartPhoneService{
//    private final SmartPhoneRepository smartPhoneRepository = new SmartPhoneRepository();
//    @Override
//    public List<Device> getAll() {
//        return smartPhoneRepository.getAll();
//    }
//
//    @Override
//    public void add(Device device) {
//        if (device instanceof SmartPhone){
//            smartPhoneRepository.add(device);
//        } else {
//            throw new IllegalArgumentException("Điện thoại không hợp lệ!");
//        }
//    }
//
//    @Override
//    public SmartPhone findByCode(String code) {
//        return (SmartPhone) smartPhoneRepository.findByCode(code);
//    }
//
//    @Override
//    public void update(Device device) {
//        if (device instanceof SmartPhone){
//            smartPhoneRepository.update(device);
//        } else {
//            throw new IllegalArgumentException("Điện thoại không hợp lệ!");
//        }
//    }
//
//    @Override
//    public void delete(String code) {
//        smartPhoneRepository.delete(code);
//    }
//}
