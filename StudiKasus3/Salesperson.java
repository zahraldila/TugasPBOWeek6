package StudiKasus3;

public class Salesperson implements Comparable
{
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales)
    {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other)
    {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    // urut berdasarkan totalSales menurun;
    public int compareTo(Object other)
    {
        Salesperson o = (Salesperson) other;

        // bandingkan sales (desc)
        if (this.totalSales != o.totalSales)
            return this.totalSales - o.totalSales; // positif = this lebih besar

        // tie-breaker: lastName (desc)
        int byLast = o.lastName.compareTo(this.lastName);
        if (byLast != 0) return byLast;

        // tie-breaker: firstName (desc)
        return o.firstName.compareTo(this.firstName);
    }

    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public int getSales()        { return totalSales; }
}

