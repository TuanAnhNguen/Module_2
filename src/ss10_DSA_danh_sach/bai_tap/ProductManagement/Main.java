package ss10_DSA_danh_sach.bai_tap.ProductManagement;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        do {
            System.out.println(
                    """
                            1. Hiển thị danh sách
                            2. Thêm mới sản phẩm
                            3. Xoá sản phẩm
                            4. Cập nhật thông tin sản phẩm
                            5. Thoát
                            """
            );
            System.out.println("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    //Hiển thị sản phẩm
                    System.out.println("Hiển thị danh sách sản phẩm");
                    manager.displayProducts();
                    break;
                case 2:
                    //Thêm mới sản phẩm
                    System.out.println("Thêm mới");
                    Product product = inputDatProduct();
                    manager.add(product);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    //Xoá sản phẩm
                    System.out.println("Xoá sản phẩm");
                    System.out.println("Nhập id sản phẩm cần xoá: ");
                    int id = Integer.parseInt(sc.nextLine());
                    manager.deleteById(id);
                    break;
                case 4:
                    //Cập nhật thông tin sản phẩm
                    System.out.println("Cập nhật thông tin sản phẩm");
                    System.out.println("Nhập id sản phẩm cập nhật: ");
                    int idUpdate = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên sản phẩm: ");
                    String newName = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm: ");
                    int newPrice = Integer.parseInt(sc.nextLine());
                    Product newProduct = new Product(idUpdate, newName, newPrice);
                    manager.updateById(idUpdate, newProduct);
                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }

    public static Product inputDatProduct() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }
}
