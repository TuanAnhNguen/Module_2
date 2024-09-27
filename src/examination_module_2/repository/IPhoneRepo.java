package examination_module_2.repository;

import examination_module_2.model.Phone;

import java.util.List;

public interface IPhoneRepo {
    List<Phone> getAllPhones();
    Phone findById(String id);
    void addPhone(Phone phone);
    void deletePhone(String id);
    void displayAllPhone();
    void searchPhone(String id);
}
