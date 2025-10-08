package StudiKasus2;

public abstract class Shape {
    // variabel instance untuk nama shape
    protected String shapeName;

    // konstruktor menyimpan nama shape
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // metode abstrak area()
    public abstract double area();

    @Override
    public String toString() {
        return shapeName;
    }
}
