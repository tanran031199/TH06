package TH.TH03;

public class Product {
    int productId;
    String productName;
    float productPrice;
    Category category;

    Product(int id, String name, float price, Category category) {
        this.productId = id;
        this.productName = name;
        this.productPrice = price;
        this.category = category;
    }

    public void display() {
        System.out.printf("Mã sản phẩm: %d.\n" +
                "Tên sản phẩm: %s.\n" +
                "Giá: %.2f.\n" +
                "Danh mục: %s\n\n",
                productId,
                productName,
                productPrice,
                category.categoryName);
    }
}
