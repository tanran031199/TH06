package TH.TH01;

public class Rectangle {
    private double width, height;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
