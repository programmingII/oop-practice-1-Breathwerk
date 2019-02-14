//Nombre: David Macias Chacon
//Fecha: 12-2-2019
//hora:  4:21 p.m.

import java.util.Scanner;//for input and output of data

public class Exercise_12_average_3_numbers {

   public static void main(String[] args) {
   
      //Declare variables
      double first_number = 0;
      double second_number = 0;
      double third_number = 0;
      double add = 0;
      double average = 0;

      //Initialize scanner isntance ¨ip¨
      Scanner ip = new Scanner ( System.in );

      //Insert data in three variables, the three numbers
      System.out.print ( "First number: " );
      first_number = ip.nextDouble();
      System.out.print ( "Second number: ");
      second_number = ip.nextDouble();
      System.out.print ( "Third number: ");
      third_number = ip.nextDouble();

      //Calculate average of three numbers
      add = first_number + second_number + third_number;
      average = add / 3;

      //Print the average of three numbers
      System.out.print ("The average of the three number is: " + average );

   }

}