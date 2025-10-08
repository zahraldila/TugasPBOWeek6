package StudiKasus3;

import java.util.Scanner;

public class WeeklySales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // ADDED: minta user berapa banyak data salesperson
        System.out.print("Masukkan jumlah salesperson: ");
        int n = scan.nextInt();
        scan.nextLine(); // bersihkan newline

        // ADDED: buat array sesuai jumlah input
        Salesperson[] salesStaff = new Salesperson[n];

        // ADDED: baca data tiap salesperson
        for (int i = 0; i < n; i++) {
            System.out.println("\nData ke-" + (i + 1));

            System.out.print("Nama depan: ");
            String first = scan.nextLine();

            System.out.print("Nama belakang: ");
            String last = scan.nextLine();

            System.out.print("Total penjualan: ");
            int sales = scan.nextInt();
            scan.nextLine(); // bersihkan newline

            salesStaff[i] = new Salesperson(first, last, sales);
        }

        // CHANGED: urutkan pakai insertionSort (descending)
        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking penjualan minggu ini:\n");
        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}

// public class WeeklySales
// {
//     public static void main(String[] args)
//     {
//         Salesperson[] salesStaff = new Salesperson[10];

//         salesStaff[0] = new Salesperson("Jane",  "Jones",  3000);
//         salesStaff[1] = new Salesperson("Daffy", "Duck",   4935);
//         salesStaff[2] = new Salesperson("James", "Jones",  3000);
//         salesStaff[3] = new Salesperson("Dick",  "Walter", 2800);
//         salesStaff[4] = new Salesperson("Don",   "Trump",  1570);
//         salesStaff[5] = new Salesperson("Jane",  "Black",  3000);
//         salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
//         salesStaff[7] = new Salesperson("Andy",  "Adams",  5000);
//         salesStaff[8] = new Salesperson("Jim",   "Doe",    2850);
//         salesStaff[9] = new Salesperson("Walt",  "Smith",  3000);

//         // insertionSort descending
//         Sorting.insertionSort(salesStaff);

//         System.out.println("\nRanking of Sales for the Week\n");
//         for (Salesperson s : salesStaff)
//             System.out.println(s);
//     }
// }

