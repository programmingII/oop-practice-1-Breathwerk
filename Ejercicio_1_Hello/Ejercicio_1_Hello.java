//package Ejercicio_1_Hello;

import javax.swing.*;
import java.util.*;

public class Ejercicio_1_Hello{
   public static void main (String[] args){

      String first_name= "";
      String last_name= "";

      Scanner input = new Scanner(System.in);

      System.out.println ("First name: ");
      first_name= input.next();
      System.out.println ("Last name: ");
      last_name= input.next();
      System.out.println ("Hello");
      System.out.println (first_name+" "+last_name);

   }
}
