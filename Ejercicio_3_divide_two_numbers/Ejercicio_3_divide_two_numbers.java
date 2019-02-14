 import java.util.Scanner;

public class Ejercicio_3_divide_two_numbers {
  public static void main(String[] args) 
  {

    int first_number =  0;
    int second_number =  0;
    int divide =  0;

    Scanner input = new Scanner (System.in);


    System.out.print("First number: ");
    first_number = input.nextInt();
    System.out.print("Second number: ");
    second_number = input.nextInt();
    divide = first_number / second_number;
    System.out.println("Dividing the " + first_number + " and " + second_number + " results in " + divide);   

  }
}