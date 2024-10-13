
package Topic_2_linkedlist_int;


public class Linkedlist {
    private Node head; 
    
        // Method to add a new node in the list
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
}
}
