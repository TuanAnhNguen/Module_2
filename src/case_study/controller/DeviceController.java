package case_study.controller;

import case_study.model.Device;
import case_study.model.Laptop;
import case_study.model.SmartPhone;
import case_study.service.laptop.ILaptopService;
import case_study.service.laptop.LaptopService;
import case_study.service.smartphone.ISmartPhoneService;
import case_study.service.smartphone.SmartPhoneService;

import java.util.List;
public class DeviceController {

    private ILaptopService laptopService = new LaptopService();
    public List<Device> getLaptops() {
        return laptopService.getAll();
    }

    public Laptop findLaptopByCode(String code) {
        return (Laptop) laptopService.findByCode(code);
    }

    public void addLaptop(Laptop laptop) {
        laptopService.add(laptop);
    }

    public void updateLaptop(Laptop laptop) {
        laptopService.update(laptop);
    }

    public void deleteLaptop(String code) {
        laptopService.delete(code);
    }

    public boolean isExistLaptop(String code) {
        return laptopService.findByCode(code) != null;
    }

    private ISmartPhoneService smartPhoneService = new SmartPhoneService();
    public List<Device> getSmartPhones() {
        return smartPhoneService.getAll();
    }
    public SmartPhone findSmartPhoneByCode(String code) {
        return (SmartPhone) smartPhoneService.findByCode(code);
    }
    public void addSmartPhone(SmartPhone smartPhone) {
        smartPhoneService.add(smartPhone);
    }
    public void updateSmartPhone(SmartPhone smartPhone) {
        smartPhoneService.update(smartPhone);
    }
    public void deleteSmartPhone(String code) {
        smartPhoneService.delete(code);
    }
    public boolean isExistSmartPhone(String code) {
        return smartPhoneService.findByCode(code) != null;
    }
}
