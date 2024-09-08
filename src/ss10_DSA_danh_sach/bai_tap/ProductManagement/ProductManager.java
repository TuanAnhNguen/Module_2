package ss10_DSA_danh_sach.bai_tap.ProductManagement;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static List<Product> products = new ArrayList<Product>();                   // khai báo biến
    static {
        Product product1 = new Product(1, "Samsung", 10000000);         // khởi tạo 3 đối tượng và thêm vào danh sách products
        Product product2 = new Product(2, "Oppo", 5000000);
        Product product3 = new Product(3, "Iphone", 20000000);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    public void displayProducts() {                                                   // Hiển thị thông tin tất cả sản phẩm
        for (Product product : products) {                                            // lặp qua danh sách và in ra từng sp
            System.out.println(product);
        }
    }

    public void add(Product product) {                                               // thêm sp mới vào danh sách
        for (Product p : products) {                                                 // kiểm tra id đã có bị trùng ko
            if (p!= null && p.getId() == product.getId()) {
                System.out.println("Sản phẩm có id: " + product.getId() + " đã tồn tại!");
                return;
            }
        }
        products.add(product);                                                      // nếu id không trùng, thêm mới sp và danh sách
        System.out.println("Thêm sản phẩm thành công!");
    }

    public void deleteById(int id) {
        boolean found = false;                                                       // khai báo biến found để tìm xem có sp nào khớp với id đang tìm ko
        for (Product p : products) {                                                 // vòng lặp for duyệt qua từng sp trong danh sách
            if (p != null && p.getId() == id) {
                products.remove(p);
                return;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có mã: " + id);
        }
    }

    public void updateById(int id, Product newProduct) {
        boolean found = false;
        for (Product p : products) {
            if (p != null && p.getId() == id) {
                p.setName(newProduct.getName());
                p.setPrice(newProduct.getPrice());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có mã: " + id);
        }
    }
}
