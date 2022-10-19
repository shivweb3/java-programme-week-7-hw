package week7_hw;
/*
5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|
 */

import java.util.Scanner;

public class Programme5 {
    static int employeeID,basicsalary;
    static String name;
    static float hra,da,ta,pf,grosssalary;
    static Scanner sc=new Scanner(System.in);


    public static void main(String[] args) {
        infoInput();
        salaryslip();
    }

    public static void infoInput(){
        System.out.print("Enter employee name: ");
        name=sc.nextLine();
        System.out.print("Enter employee id: ");
        employeeID=sc.nextInt();
        System.out.print("Enter employee's basic salary: ");
        basicsalary=sc.nextInt();
        hra = (basicsalary*10)/100f;
        da = (basicsalary*8)/100f;
        ta= (basicsalary*9)/100f;
        pf=(basicsalary*20)/100f;

        grosssalary= (basicsalary+hra+ta+da)-pf;

    }
    public static void salaryslip(){
        System.out.println("|---------------------------|");
        System.out.println("|        Salary Slip        |");
        System.out.println("|---------------------------|");
        System.out.println("|Employee Id  : " + employeeID + "         |");
        System.out.println("|Employee Name: " + name + "      |");
        System.out.println("|---------------------------|");
        System.out.println("|Basic Salary : " + basicsalary + "       |");
        System.out.println("|HRA 10%      : " + hra + "      |");
        System.out.println("|TA   8%      : " + ta + "      |");
        System.out.println("|DA   9%      : " + da + "      |");
        System.out.println("|PF(-20%)     : " + pf + "      |");
        System.out.println("|---------------------------|");
        System.out.println("|Gross Salary : " + grosssalary + "     |");
        System.out.println("|---------------------------|");
    }
}
