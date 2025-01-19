package Sorting;

import java.util.Scanner;

public class ShellSort {

    public static void shellSort(int[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > key) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = key;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        shellSort(arr);

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
