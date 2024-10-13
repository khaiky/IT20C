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
        
        }


