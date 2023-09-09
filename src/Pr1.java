package src;

import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        short a,b;


        System.out.print("Enter the value of length (a) : ");
        a = input.nextShort();

        System.out.print("Enter the value of breadth (b) : ");
        b = input.nextShort();

        System.out.print("Here is your area : "+a*b+" | here is your perimeter"+ (2*(a+b)) );



    }
}
