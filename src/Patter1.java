package src;

public class Patter1 {
    public static void main(String[] args) {
        System.out.println("This is a pattern");

        byte i, j, k;

        for(i=1; i<=5; i++)
        {
            for(k=5; k>i; k--)
            {
                System.out.print("");
            }
            for(j=1; j<=i; j++)
            {
                System.out.print(""+j);
            }

            for(j=i; j<=5; j++)
            {
                System.out.println(""+j);
            }
            System.out.println();
        }
    }
}
