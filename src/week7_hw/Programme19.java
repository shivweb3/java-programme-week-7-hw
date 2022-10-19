package week7_hw;
/*
19. Write a Java program to calculate the average value of array elements.
 */
public class Programme19 {
    public static void average() {
        int[] num = new int[]{10, 20, 30, 40, 50};
        int sum=0;
        for (int i=0; i < num.length; i++)
            sum = sum + num[i];
        //calculate average value
        double average = sum / num.length;
        System.out.println("Average Value Is :" + average);
    }

}
