package week7_hw;

import java.util.Scanner;

/*
6. Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {

    public static void main(String[] args) {
        oddeven();

    }

    public static void oddeven() {
        met1();
    }

    public static void met1(){
        Scanner sc = new Scanner(System.in);
        int a;
        String output;
        System.out.println("Enter any number");
        a = sc.nextInt();
        if(a%2==0) {
            System.out.println("Entered Number Is Even");
        }else {
            System.out.println("Enter Number Is Odd");
        }
        }
    }

