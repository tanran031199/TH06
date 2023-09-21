package TH.TH03;

public class Category {
    public int categoryId;
    public String categoryName;

    Category(int id, String name) {
        this.categoryId = id;
        this.categoryName = name;
    }

    public void display() {
        System.out.println("Mã danh mục: " + categoryId + "\n" +
                "Tên danh mục: " + categoryName);
    }
}
