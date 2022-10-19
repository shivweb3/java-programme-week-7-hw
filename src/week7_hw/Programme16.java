package week7_hw;
/*
16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */

import java.util.Scanner;

public class Programme16 {
    int number;

    public static void main(String[] args) {
        postive();
    }

    public static void postive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number You Want To Check");
        int number;
        number=scanner.nextInt();
        scanner.close();
        if(number>0)
        {
            System.out.println(number+" Is Positive Number");
        }
        else if(number < 0)
        {
            System.out.println(number+ "Is Negative Number");
        } else {
            System.out.println(number+ "Is Neither Positive Nor Negative");
        }
    }


}
