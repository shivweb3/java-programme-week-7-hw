package week7_hw;
/*
4. Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.

 */

import java.util.Scanner;

public class Programme4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year :");
        int a = scanner.nextInt();
        isLeapYear(a);
        System.out.println("Enter month:");
        int c = scanner.nextInt();
        getDaysInMonth(c,a);

    }

    public static void isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Entered year is a Leap Year");
            } else {
                System.out.println("Entered year is not a Leap Year");
            }

        } else {
            System.out.println("False");
        }

    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 && month > 12) {
            System.out.println("-1");
        }

        else {
            if (year < 1 && year > 9999) {
                System.out.println("-1");
            } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("29 days");
            } else {
                if ((month == 1) | (month == 3) | (month == 5) | (month == 7) | (month == 8) | (month == 10) | (month == 12)){
                    System.out.println("31 Days");
                }
                else if ((month == 4) | (month == 6) | (month == 9) | (month == 11)){
                    System.out.println("30 Days");
                }
                else{
                    System.out.println("28 Days");
                }
            }
        }
        return -1;
    }
}


