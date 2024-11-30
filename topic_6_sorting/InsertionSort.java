
package topic_6_sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
     public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
  
     public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
             int[] arr = null;
             long timeTaken = 0;
             
     while(true) {
                
                 System.out.println("Kindly choose a number: "
                        + " 1. Add array Elements"
                        + " 2. View sorted array and time taken."
                        + " 3. Exit");
                int choice = sc.nextInt();
     }
}
}