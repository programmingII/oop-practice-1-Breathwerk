//Nombre:David Macias Chacon
//Fecha:12-02-2017
//Hora: 4:00 a.m.

import java.util.Scanner;//to input and aoutput data

public class Exercise_6_operations_two_numbers {

  public static void main(String[] args) 
  {

    //Declare variables
    int first_number =  0;
    int second_number =  0;
    int result =  0;

    //Use this command to use variables for saving data
    Scanner ip = new Scanner (System.in);

    //Save data in the declared in the two variables 
    //("first_number" and "second_number" respectively)
    System.out.print("First number: ");
    first_number = ip.nextInt();
    System.out.print("Second number: ");
    second_number = ip.nextInt();

    //The variable will be added, substracted, multiplied, divided and modulated between themselves 
    result = first_number + second_number;
    System.out.println("Adding " + first_number + " and " + second_number + " results in " + result);   
    result = first_number - second_number;
    System.out.println("Substracting " + second_number + " to " + first_number + " results in " + result);   
    result = first_number * second_number;
    System.out.println("Product of " + first_number + " and " + second_number + " is " + result);   
    result = first_number / second_number;
    System.out.println("Dividing " + first_number + " by " + second_number + " results in " + result);   
    result = first_number % second_number;
    System.out.println("The remainder of the division between " + first_number + " by " + second_number + " results in " + result);   


  }
}