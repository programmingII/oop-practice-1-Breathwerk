//Name: David Macias
//Date: 2/13/2019
//Time: 2:34 a.m.

import java.util.Scanner;// io lybrary

public class Exercise_15_swap_2_variables {

   public static void main ( String[] args ) {

      //Variables initiate here
      double variable1 = 0;
      double variable2 = 0;
      double swap = 0;

      //Instatiation ip for retrieving data
      Scanner ip = new Scanner ( System.in );

      //Give values to the 2 variables
      System.out.print ( "Wright values of the 2 variables.-\n" + 
                          "Variable 1: ");
      variable1 = ip.nextDouble();
      System.out.print ( "Variable 2: ");
      variable2 = ip.nextDouble();
      System.out.print ( "Remember that...they will be swapped\n" );
      

      //Swaping is done here
      swap = variable1;
      variable1 = variable2;
      variable2 = swap;
      
    //Show swapped variables
    System.out.print ( "Variable 1: " + variable1 + "\n");
    System.out.print ( "Variable 2: " + variable2);

   }
}