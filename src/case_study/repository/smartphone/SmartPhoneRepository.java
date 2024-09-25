package case_study.repository.smartphone;

import case_study.common.File;
import case_study.model.Device;
import case_study.model.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneRepository implements ISmartPhoneRepository {
    private static final List<Device> smartPhones = new ArrayList<>();
    @Override
    public List<Device> getAll() {
        return smartPhones;
    }

    @Override
    public void add(Device device) {
        if (device instanceof SmartPhone) {
            SmartPhone smartPhone = (SmartPhone) device;
            File.writeToSmartPhoneFile(smartPhone);
            System.out.println("Thêm mới thành công!");
        } else {
            System.out.println("Sản phẩm không hợp lệ!");
        }
    }

    @Override
    public Device findByCode(String code) {
        for (Device device : smartPhones) {
            if (device.getCode().equals(code)) {
                return device;
            }
        }
        return null;
    }

    @Override
    public void update(Device device) {
        if (device instanceof SmartPhone) {
            for (int i = 0; i < smartPhones.size(); i++) {
                if (smartPhones.get(i).getCode().equals(device.getCode())) {
                    smartPhones.set(i, device);
                    return;
                }
            }
            System.out.println("Không tìm thấy sản phẩm!");
        } else {
            System.out.println("Sản phầm không hợp lệ!");
        }
    }

    @Override
    public void delete(String code) {
        smartPhones.removeIf(smartPhone -> smartPhone.getCode().equals(code));
        System.out.println("Đã xoá sản phẩm!");
    }
}
