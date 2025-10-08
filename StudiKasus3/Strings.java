package StudiKasus3;

import java.util.Scanner;

public class Strings
{
    // Membaca sejumlah String, mengurutkan, lalu mencetak (descending)
    public static void main(String[] args)
    {
        // ADDED: array String sudah Comparable
        String[] list;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nBerapa banyak string yang ingin diurutkan? ");
        size = scan.nextInt();
        scan.nextLine(); // buang newline

        list = new String[size];

        System.out.println("\nMasukkan string-nya (satu per baris)...");
        for (int i = 0; i < size; i++)
            list[i] = scan.nextLine();

        // ADDED: urut menurun (Z..A)
        Sorting.insertionSort(list);

        System.out.println("\nHasil urut (descending):");
        for (String s : list)
            System.out.print(s + " ");
        System.out.println();
    }
}
