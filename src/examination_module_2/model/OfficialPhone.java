package examination_module_2.model;

public class OfficialPhone extends Phone {
    private int warrantyPeriod;
    private String warrantyScope;

    public OfficialPhone(int id, String number, double price, int quantity, String manufacturer, int warrantyPeriod, String warrantyScope) {
        super(id, number, price, quantity, manufacturer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyScope = warrantyScope;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyScope() {
        return warrantyScope;
    }

    public void setWarrantyScope(String warrantyScope) {
        this.warrantyScope = warrantyScope;
    }

    @Override
    public String toString() {
        return "OfficialPhone{" + super.toString() +
                "warrantyPeriod=" + warrantyPeriod +
                ", warrantyScope='" + warrantyScope + '\'' +
                '}';
    }
}
