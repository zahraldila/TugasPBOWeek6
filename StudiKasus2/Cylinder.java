package StudiKasus2;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Rumus di instruksi: PI * r^2 * height (itu volume)
    // Diperbaiki jadi luas permukaan: 2 * PI * r * (r + height)
    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return super.toString() + " (radius=" + radius + ", height=" + height + ")";
    }
}
