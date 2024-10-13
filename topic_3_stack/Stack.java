
package topic_3_stack;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    
     // Constructor should be declared without a return type (void)
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
}
}
