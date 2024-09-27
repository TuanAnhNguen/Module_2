package examination_module_2.model;

public class ImportedPhone extends Phone {
    private String country;
    private String status;


    public ImportedPhone(int id, String number, double price, int quantity, String manufacturer, String country, String status) {
        super(id, number, price, quantity, manufacturer);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ImportedPhone{" + super.toString() +
                "country='" + country + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
