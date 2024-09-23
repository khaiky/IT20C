
package simple_implementation;


public class Simple_implementation {

    
    public static void main(String[] args) {
          
          //declare variable inside the array"
          
          String [] names = {"film.jww", "dk_is_deokyeom", "seventeen headliner", "hoshi"};
          
          //printing names using the index inside the array
          
          System.out.println(names[0]);
          System.out.println(names[1]);
          System.out.println(names[2]);
          
          //output
          /*film.jww
          dk_is_deokyeom
          seventeen headliner
          */
          
          int [] num = {2,4,6,8,10,12};
          
          //procedure
          
          System.out.println("Sum : " + (num[1] + num[2]));
          System.out.println("Difference : " + (num[3] - num[2]));
          System.out.println("Product : " + (num[1] * num[2]));
          System.out.println("Quotient : " + (num[1] / num[2]));
          
          //output
          /*
          Sum : 10
          Difference : 2
          Product : 24
          Quotient : 0
          */
          
                
      }
}

   