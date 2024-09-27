package examination_module_2.service.imported_phone;

import examination_module_2.model.Phone;
import examination_module_2.repository.imported_phone.ImportedPhoneRepo;

import java.util.List;

public class ImportedPhoneService implements IImportedPhoneService {
    private final ImportedPhoneRepo importedPhoneRepo = new ImportedPhoneRepo();
    @Override
    public List<Phone> getAllPhones() {
        return importedPhoneRepo.getAllPhones();
    }

    @Override
    public Phone findById(String id) {
        return importedPhoneRepo.findById(id);
    }

    @Override
    public void addPhone(Phone phone) {
        importedPhoneRepo.addPhone(phone);
    }

    @Override
    public void deletePhone(String id) {
        importedPhoneRepo.deletePhone(id);
    }

    @Override
    public void displayAllPhone() {
        importedPhoneRepo.displayAllPhone();
    }

    @Override
    public void searchPhone(String id) {
        importedPhoneRepo.searchPhone(id);
    }
}
