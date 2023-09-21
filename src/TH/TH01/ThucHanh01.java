package TH.TH01;

import java.util.Scanner;

public class ThucHanh01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle;

        System.out.println("Nhập chiều rộng của hình chữ nhật: ");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều dài của hình chữ nhật: ");
        double height = sc.nextDouble();

        if(width > height) {
            System.out.println("Không có hình chữ nhật nào chiều rộng" +
                    " lớn hơn chiều dài cả! Nhập lại đê 😠");

            return;
        }

        rectangle = new Rectangle(width, height);

        System.out.println("Hình chữ nhật của bạn là: " + rectangle.display());
        System.out.println("Chu vi của nó là: " + rectangle.getPerimeter());
        System.out.println("Diện tích của nó là: " + rectangle.getArea());
    }
}
