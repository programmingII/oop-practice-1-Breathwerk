//Name: David Macias chacon
//Date: 2/12/2019
//Time: : 6:07 p. m.

import java.util.Scanner;//for input and output of data

public class Exercise_13_mat_rectangle {

   public static void main ( String[] args ) {

       
      //Declare variables
      double width = 0;
      double height = 0;
      double area = 0;
      double perimeter = 0;

      //Initialize scanner isntance ¨ip¨
      Scanner ip = new Scanner ( System.in );

      //Insert for the rectangule
      System.out.print ( "Width : " );
      width = ip.nextDouble();
      System.out.print ( "Height : ");
      height = ip.nextDouble();


      //Calculate area
      area = width * height ;

      //Calculate perimeter
      perimeter = width * 2 + height * 2 ;

      //Print the area and perimeter
      System.out.print ("The area is: " + area + "\n");
      System.out.print ("The perimeter is: " + perimeter);


   }

}