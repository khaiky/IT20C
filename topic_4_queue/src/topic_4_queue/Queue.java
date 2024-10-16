

package topic_4_queue;
import java.util.LinkedList;
public class Queue {
   
    private LinkedList<Costumer> customers;

    public Queue() {
        customers = new LinkedList<>();
    }

    public boolean isEmpty() {
        return customers.isEmpty();
    }

    public int size() {
        return customers.size();
    }

    public void enqueue(Custumer customer) {
        customers.addLast(customer);
        System.out.println(customer.getName() + " has been added to the queue.");
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.print("Current queue: ");
            for (Custumer customer : customers) {
                System.out.print(customer.getName() + " | ");
            }
            System.out.println();
        }
    }

    public Custumer dequeue() {
        if (!isEmpty()) {
            Custumer customer = customers.removeFirst();
            System.out.println(customer.getName() + " has been served.");
            return customer;
        } else {
            System.out.println("The queue is empty.");
            return null;
        }
    }
}

   
