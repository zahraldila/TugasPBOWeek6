package StudiKasus2;

public class Rectangle extends Shape {
    // atribut length & width
    private double length;
    private double width;

    // panggil super("Rectangle")
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // luas persegi panjang = p * l
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + " (length=" + length + ", width=" + width + ")";
    }
}
