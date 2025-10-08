package StudiKasus2;

import java.text.DecimalFormat;

public class PaintThings
{
    public static void main(String[] args)
    {
        // Nilai cakupan cat (350 kaki persegi per galon)
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        // Deklarasi variabel untuk masing-masing bentuk
        Rectangle deck;   // persegi panjang 
        Sphere bigBall;   // bola besar
        Cylinder tank;    // tabung 

        // Variabel untuk menyimpan hasil perhitungan jumlah cat
        double deckAmt, ballAmt, tankAmt;

        // Membuat (menginstansiasi) tiga bentuk yang akan dicat
        deck = new Rectangle(20, 35);
        bigBall = new Sphere(15);
        tank = new Cylinder(10, 30);

        // Menghitung jumlah cat yang dibutuhkan untuk masing-masing bentuk
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        // Membuat formatter untuk membatasi angka desimal saat ditampilkan
        DecimalFormat fmt = new DecimalFormat("0.#");

        // Menampilkan hasil perhitungan ke layar
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
