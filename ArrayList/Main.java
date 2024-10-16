
package ArrayList;
import java.util.Scanner;
public class Main {
     public static void main(String[] args){
        
        //Added a scanner to have user inputs
        Scanner sc = new Scanner(System.in);
        
         //add a default list
        ItemManager list = new ItemManager();
        list.addName("Zion");
        
         //displaying the updated items
        list.displayItems();
        
        //Added a println that corresponds with the codes on ItemManager.java
        System.out.println("Enter the Name You Want to Add: ");
        String item = sc.nextLine();
        
         //adding item
        list.addName(item);
        
        //To have the user change names
        System.out.println("Enter the Name You Want to Change: " );
        String newItem = sc.nextLine();
        //To specify what index the user wants to be change
        System.out.println("Enter Index Number: ");
        int index = sc.nextInt();
        
         //Show the updated list of names
        list.updateItem(index, newItem);
        list.displayItems();
        //To revert the code back to String for the next user input
        sc.nextLine();
        
         //Added a println that corresponds with the codes on ItemManager.java
        System.out.println("Enter the Name You Want to Find:" );
        String findItem = sc.nextLine();
        
        //finding item
        list.findItem(findItem);
        list.displayItems();
        
        //Added a println that corresponds with the codes on ItemManager.java
        System.out.println("Enter Index Number of the Name You Want to Delete: ");
        int deleteIndex = sc.nextInt();
        
           //deleting items
        list.deleteItem(deleteIndex);
        list.displayItems();
        
        //closing the scanner
        sc.close();
        
    }
}


