//Nombre:David Macias Chacon
//Fecha:12-02-2017
//Hora: 6:30 a.m.

import java.util.Scanner; //to input and output data

//program to compute a specified formula

public class Exercise_10_Compute_Formula {
 
    public static void main(String[] args) {

        //Create variables for formula and assign them value
        double n1 = 4;
        double n2 = 1;
        double n3 = 3;
        double n4 = 5;
        double n5 = 7;
        double n6 = 9;
        double n7 = 11;

        //Execute formula
        System.out.println( n1 * ( n2 - ( n2 / n3 ) + ( n2 / n4 ) - ( n2 / n5 ) + ( n2 / n6 ) - ( n2 / n7 ) ) );


    }
}
