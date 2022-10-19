package week7_hw;
/*
17. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme17 {
    public static void main(String[] args){

        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] my_array2 = {
                "Java",
                "Poker",
                "Henry",
                "Kent",
                "Shiv",
                "Joe"
        };
        System.out.println("Original numeric array : "+Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

        System.out.println("Original string array : "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}
