//Nombre:David Macias Chacon
//Fecha:12-02-2017
//Hora: 4:28 a.m.

// Multithe multiplication table up to 10 of any number

import java.util.Scanner; //to input and aoutput data

public class Exercise_7_table_10 {

   public static void main(String[] args) {

     int number = 0; //Declare variable

     Scanner ip = new Scanner(System.in); //to save data on variables

     //Input
     System.out.println("Where going to do the multiplication table up to 10\n" + "of: ");
     number = ip.nextInt();

     //To do and show the multiplication table
     for (int i = 1; i <= 10; i++) {
           System.out.println(i + " x " + number + " = " + (number * i));
     }
 }
}
