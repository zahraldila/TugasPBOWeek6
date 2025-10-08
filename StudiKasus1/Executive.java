public class Executive extends Employee
{
    private double bonus;

    public Executive(String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0;  // bonus belum diberikan
    }

    public void awardBonus(double execBonus)
    {
        bonus = execBonus;
    }

    public double pay()
    {
        double payment = super.pay() + bonus;
        bonus = 0; // bonus hanya sekali
        return payment;
    }
}
