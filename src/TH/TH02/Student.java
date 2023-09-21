package TH.TH02;

public class Student {
    public int studentId, age;
    public String studentName, className, address;
    public boolean gender;

    Student(int id, int age, String name, String cln, String adr, boolean g) {
        this.studentId = id;
        this.age = age;
        this.studentName = name;
        this.className = cln;
        this.address = adr;
        this.gender = g;
    }

    public void display() {
        System.out.printf("Mã HS: %d.\n" +
                "Tên HS: %s.\n" +
                "Tuổi: %d.\n" +
                "Giới tính: %s.\n" +
                "Lớp: %s.\n" +
                "Địa chỉ: %s.\n\n",
                studentId,
                studentName,
                age,
                gender ? "Nam" : "Nữ",
                className,
                address);
    }
}
