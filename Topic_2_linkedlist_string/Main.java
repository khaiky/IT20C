
package Topic_2_linkedlist_string;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
		
	//Creating an object to access the LinkedList Class
        LinkedList list = new LinkedList();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello, Welcome!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        
           while(true) {
            
             System.out.println("Kindly choose a number in the menu you want to do: "
                + " 1. Add an Item"
                + " 2. Delete an Item"
                + " 3. Move/Swap an Item"
                + " 4. Exit");
             int choice = sc.nextInt();
            
           switch(choice) {
                case 1:
                    // Adding elements to the list
                        System.out.println("Add 5 Elements: ");
                        sc.nextLine();
                        String item1 = sc.nextLine();
                        String item2 = sc.nextLine();
                        String item3 = sc.nextLine();
                        String item4 = sc.nextLine();
                        String item5 = sc.nextLine();

                        list.add(item1);
                        list.add(item2);
                        list.add(item3);
                        list.add(item4);
                        list.add(item5);

                        System.out.println("------------------------------");
                        list.printList();
                        System.out.println("------------------------------");
                        break;
}
}
}
}
