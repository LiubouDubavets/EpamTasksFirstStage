package org.liuboudubavest;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public void randomNumbers() {
        System.out.println("Please, write number of random elements to generate:");
        Scanner input = new Scanner(System.in);
        String x = input.next();
        double [] array = new double [Integer.parseInt(x)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random());
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}