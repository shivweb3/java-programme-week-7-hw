package week7_hw;
/*
7. Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */

import java.util.Scanner;

public class Programme7 {
    static int salesID,salesAmount,basicSalary;
    static double commission;

    static String sellername;

    public static void main(String[] args) {
        info();
    }

    public static void info(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Sales ID");
        salesID=scanner.nextInt();
        System.out.println("Enter Seller's Name:");
        sellername=scanner.next();
        System.out.println("Enter Sales Amount");
        salesAmount=scanner.nextInt();
        System.out.println("Enter Basic Salary");
        basicSalary=scanner.nextInt();

        if (salesAmount>= 50000)
        {
          commission = (salesAmount * 35)/100;
            System.out.println("Saler's Commission is" + commission);
        } else if (salesAmount >= 300000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Saler's Commission is" + commission);
        } else if (salesAmount >= 20000)
        { commission = (salesAmount * 10)/ 100;
            System.out.println("Saler's Commission is" + commission);
        } else if (salesAmount >= 10000)
        {    commission = (salesAmount * 5) / 100;
            System.out.println("Saler's Commission is" + commission);
        } else {
            commission = (salesAmount*2)/100;
            System.out.println("Saler's Commission is:" +commission);
        }




        }
}
