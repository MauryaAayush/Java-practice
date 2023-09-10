package src;

import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);


       short l1,l2,l3;
       int result;

        System.out.print("Enter the value of side 1 : ");
        l1 = input.nextShort();

        System.out.print("Enter the value of side 2 : ");
        l2 = input.nextShort();

        System.out.print("Enter the value of side 3 : ");
        l3 = input.nextShort();

        result = l1 + l2 + l3;
        System.out.println("Here is perimeter of triangle "+result);


    }
}
