 import java.util.Scanner;

public class Ejercicio_5_product_two_numbers {
  public static void main(String[] args) 
  {

    int first_number =  0;
    int second_number =  0;
    int product =  0;

    Scanner input = new Scanner (System.in);


    System.out.print("First number: ");
    first_number = input.nextInt();
    System.out.print("Second number: ");
    second_number = input.nextInt();
    product = first_number * second_number;
    System.out.println("The product of " + first_number + " and " + second_number + " results in " + product);   

  }
}