//Nombre:David Macias Chacon
//Fecha:12-02-2017
//Hora: 1:38 p.m.

import java.util.Scanner; //to input and output data
       

public class Exercise_11_math_circle {

   public static void main(String[] args) {

   //Declare variables
   double radius = 0;
   double Perimeter = 0;
   double Area =  0;

   //to save data on variables
   Scanner ip = new Scanner(System.in);

   //Capture radius of circle
   System.out.println("Radius: ");
   radius = ip.nextDouble();

   //Calculate perimeter and area
   Perimeter = (2 * radius * Math.PI);
   Area = (Math.PI * ( radius * radius ) );

   //Show perimeter
   System.out.println("Perimeter: " + Perimeter);
   System.out.println( "Area: " + Area );

 }
}

