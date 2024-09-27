package examination_module_2.service;

import examination_module_2.model.Phone;

import java.util.List;

public interface IPhoneService {
    List<Phone> getAllPhones();
    Phone findById(String id);
    void addPhone(Phone phone);
    void deletePhone(String id);
    void displayAllPhone();
    void searchPhone(String id);
}
