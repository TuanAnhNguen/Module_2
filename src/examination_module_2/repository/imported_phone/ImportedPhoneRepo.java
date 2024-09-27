package examination_module_2.repository.imported_phone;

import examination_module_2.model.ImportedPhone;
import examination_module_2.model.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ImportedPhoneRepo implements IImportedPhoneRepo {
    private static final List<Phone> importedPhones = new ArrayList<>();
    @Override
    public List<Phone> getAllPhones() {
        return importedPhones;
    }

    @Override
    public Phone findById(String id) {
        for (Phone phone : importedPhones) {
            if (Objects.equals(phone.getId(), id)) {
                return phone;
            }
        }
        return null;
    }

    @Override
    public void addPhone(Phone phone) {
        if (phone instanceof ImportedPhone) {
            importedPhones.add((ImportedPhone) phone);
        }
    }

    @Override
    public void deletePhone(String id) {
        importedPhones.remove(id);
    }

    @Override
    public void displayAllPhone() {
        for (Phone phone : importedPhones) {
            System.out.println(phone);
        }
    }

    @Override
    public void searchPhone(String id) {
        for (Phone phone : importedPhones) {
            if (Objects.equals(phone.getId(), id)) {
                System.out.println(phone);
            }
        }
    }
}
