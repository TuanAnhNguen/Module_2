package case_study.model;

public class SmartPhone extends Device {
    private String operatingSystem;    // hệ điều hành
    private int capacity; //dung lượng pin

    public SmartPhone(String code,String name, String manufacturer, int yearOfManufacture, String color, int capacity) {
        super(code, name, manufacturer, yearOfManufacture);
        this.operatingSystem = color;
        this.capacity = capacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + super.toString() +
                "color='" + operatingSystem + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
