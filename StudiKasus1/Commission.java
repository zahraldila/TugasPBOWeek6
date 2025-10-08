public class Commission extends Hourly
{
    // total penjualan & persen komisi (mis. 0.2 = 20%)
    private double totalSales;
    private double commissionRate;

    // konstruktor 
    public Commission(String name, String address, String phone,
                      String socSecNumber, double rate, double commissionRate)
    {
        super(name, address, phone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    // menambah nilai penjualan ke akumulasi
    public void addSales(double totalSales)
    {
        this.totalSales += totalSales;
    }

    // gaji = gaji per jam (super.pay()) + komisi dari penjualan
    @Override
    public double pay()
    {
        double payment = super.pay() + (commissionRate * totalSales);
        totalSales = 0; // reset setelah dibayar
        return payment;
    }

    // tampilkan juga informasi totalSales
    @Override
    public String toString()
    {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}
