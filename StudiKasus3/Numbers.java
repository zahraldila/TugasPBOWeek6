package StudiKasus3;

import java.util.Scanner;

public class Numbers
{
    // Membaca sejumlah bilangan, mengurutkan, lalu mencetak (descending)
    public static void main(String[] args)
    {
        // gunakan Integer[] (objek) agar cocok dengan Comparable[]
        Integer[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size]; 

        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();

        // insertionSort (descending)
        Sorting.insertionSort(intList);

        System.out.println("\nYour numbers is sorted orders...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println();
    }
}

