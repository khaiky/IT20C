//Adding package for arraylist
package ArrayList;

import java.util.ArrayList;
public class ItemManager {
    private ArrayList<String> items;
        
        public ItemManager(){
            items = new ArrayList();
             //Added function to display the items
        }
        public void displayItems(){
            System.out.println("Names on our list: " +items);
        }
        //Added a function to add items into the arraylist
        public void addName(String item){
            items.add(item);
            System.out.println("Names: " + items);
        }
             /*Added a function by using the if-else statement with the right conditions to 
        update/change the items on the arraylist */
        public void updateItem(int index, String newItem){
            if(index >= 0 && index < items.size()){
                String olditem = items.set(index, newItem);
                System.out.println("Successfully Updated: " + olditem + " to " + newItem);
            }
            else{
                System.out.println("Index Out of Bounds");
            }
        }
            /*Added a function to  find the items that the user wants to find in the list
        using if-else statement*/
        public void findItem(String itemfind) {
            int index = items.indexOf(itemfind);
                if (index != -1) {
                System.out.println("Found: " + itemfind + " at index " + index);
                } 
                else 
                {
                System.out.println(itemfind + " not found.");
            }
        }
                 /*Added a function to  delete the items depending on the index number
        that the user wants to delete*/
        public void deleteItem(int index) {
        if (index >= 0 && index < items.size()) {
            String removedItem = items.remove(index);
            System.out.println("Successfully Deleted: " + removedItem);
        } else {
            System.out.println("Index Out of Bounds");
        }
        }
        }
        


