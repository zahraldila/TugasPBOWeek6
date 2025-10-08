package StudiKasus2;

public class Sphere extends Shape {
    // atribut radius
    private double radius;

    // panggil super("Sphere")
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // luas permukaan bola 4 * PI * r^2
    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + " (radius=" + radius + ")";
    }
}
