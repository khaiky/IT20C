
package topic_6_sorting;

import java.util.Scanner;

public class SelectionSort {
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
                
                 switch(choice) {
                    case 1:
                            System.out.println();
                            System.out.println("Enter the number of elements you want to store in the array:");
                            int num = sc.nextInt();
                            arr = new int[num];
                        
                            System.out.println("Enter " + num + " elements.");
                            for(int i = 0; i < num; i++) {
                              arr[i] = sc.nextInt();
                            }
                            break;
                
}
     }
}
}