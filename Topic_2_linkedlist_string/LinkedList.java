
package Topic_2_linkedlist_string;


public class LinkedList {
     private Node head; 

    // Method to add a new node at the end of the list
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
}
}