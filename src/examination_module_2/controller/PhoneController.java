package examination_module_2.controller;

import examination_module_2.model.Phone;
import examination_module_2.service.IPhoneService;
import examination_module_2.service.imported_phone.ImportedPhoneService;

import java.util.List;

public class PhoneController {
    private final IPhoneService importedService = new ImportedPhoneService();

    public List<Phone> getAllPhones() {
        return importedService.getAllPhones();
    }

    public Phone getPhoneById(String id) {
        return importedService.findById(id);
    }

    public void addImportedPhone(Phone phone) {
        importedService.addPhone(phone);
    }

    public void deleteImportedPhone(String id) {
        importedService.deletePhone(id);
    }

    public void displayAllImportedPhones() {
        importedService.displayAllPhone();
    }

    public void searchImportedPhone(String id) {
        importedService.searchPhone(id);
    }
}
