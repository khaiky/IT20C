

package topic_4_queue;

import java.util.Scanner;
public class Main {

  
    public static void main(String[] args) {
         Queue customerQueue = new Queue();
        Scanner scanner = new Scanner(System.in);
        String choice;
        
         do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve customer");
            System.out.println("3. Display queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
         }
         }
}
