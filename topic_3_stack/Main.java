
package topic_3_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 Stack  stack = new Stack();
	
         System.out.println("Hello, Welcome!");
         
        while(true) { 
            System.out.println("Choose what you wanna do: "
		  + " 1. Size"
		  + " 2. Push"
		  + " 3. Pop"
		  +  " 4. Exit");
		 int choice = sc.nextInt();
                 switch(choice) {
				        
		case 1:
			System.out.println("Stack size is: " + stack.size());
			System.out.println("-------------------");
			break;
                 }
        }
}
}
