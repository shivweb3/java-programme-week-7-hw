package week7_hw;
/*
9. Same as above program-8 using switch statement.
 */


import java.util.Scanner;

public class Programme9 {
    static char city;

    public static void main(String[] args)  { cityname(); }
    public static void cityname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter between A to F:");
        city = scanner.next().charAt(0);

        switch (city) {
            case 'a':
            case 'A':
                System.out.println("Ahmedabad");
                break;

            case 'b':
            case 'B':
                System.out.println("Baroda");
                break;

            case 'c':
            case 'C':
                System.out.println("Chandigadh");
                break;

            case 'd':
            case 'D':
                System.out.println("Delhi");
                break;

            case 'e':
            case 'E':
                System.out.println("Edinburgh");
                break;

            case 'f':
            case 'F':
                System.out.println("Faridabad");
                break;
        }
                System.out.println("Invalid Entry");



        }



    }


