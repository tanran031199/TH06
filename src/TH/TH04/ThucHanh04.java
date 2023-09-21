package TH.TH04;

import java.util.Scanner;

public class ThucHanh04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator;

        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();

        calculator = new Calculator(a, b);

        System.out.println("Tổng a + b số là: " + calculator.add());
        System.out.println("Hiệu a - b số là: " + calculator.sub());
        System.out.println("Tích a * b số là: " + calculator.multi());
        System.out.println("Thương a / b số là: " + calculator.div());
    }
}
