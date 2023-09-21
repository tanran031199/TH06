package TH.TH03;

public class ThucHanh03 {
    public static void main(String[] args) {
        Category dm1 = new Category(1, "Quần");
        Category dm2 = new Category(2, "Áo");

        Product p1 = new Product(1, "Quần âu", 150000, dm1);
        Product p2 = new Product(2, "Quần jean", 250000, dm1);
        Product p3 = new Product(3, "Áo sơ mi", 125000, dm2);
        Product p4 = new Product(4, "Áo phông", 175000, dm2);

        System.out.println("------------------ Sản phẩm " + p1.productId + " ------------------");
        p1.display();
        System.out.println("------------------ Sản phẩm " + p2.productId + " ------------------");
        p2.display();
        System.out.println("------------------ Sản phẩm " + p3.productId + " ------------------");
        p3.display();
        System.out.println("------------------ Sản phẩm " + p4.productId + " ------------------");
        p4.display();
    }
}
