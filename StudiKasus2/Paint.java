package StudiKasus2;

//
public class Paint {
    // Mewakili coverage dalam sq ft per gallon
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    // metode amount(Shape s)
    public double amount(Shape s) {
        // tampilkan pesan untuk menunjukkan polimorfisme
        System.out.println("Computing amount for " + s);
        // jumlah cat (gallon) = area / coverage
        return s.area() / coverage;
    }
}
