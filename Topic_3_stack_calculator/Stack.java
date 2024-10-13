
package Topic_3_stack_calculator;

public class Stack {
     private int maxSize;
    private Object[] stackArray; // Change to Object array for generics
    private int top;
    
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new Object[maxSize];
        this.top = -1; 
}
}
