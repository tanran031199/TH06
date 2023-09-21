package TH.TH02;

public class ThucHanh02 {
    public static void main(String[] args) {
        Student stu1 = new Student(1, 19, "Nguyên Văn A", "JV-01", "Hà Nội", true);
        Student stu2 = new Student(2, 21, "Nguyên Văn B", "JV-02", "Bắc Giang", true);
        Student stu3 = new Student(3, 23, "Nguyên Văn C", "JV-03", "Sơn La", true);

        System.out.println("-------------------- Thông tin của HS-" + stu1.studentId + "--------------------");
        stu1.display();
        System.out.println("-------------------- Thông tin của HS-" + stu2.studentId + "--------------------");
        stu2.display();
        System.out.println("-------------------- Thông tin của HS-" + stu3.studentId + "--------------------");
        stu3.display();
    }
}
