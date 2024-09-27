package examination_module_2.model;

public abstract class Phone {
    private int id;
    private String number;
    private double price;
    private int quantity;
    private String manufacturer;

    public Phone(int id, String number, double price, int quantity, String manufacturer) {
        this.id = id;
        this.number = number;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
