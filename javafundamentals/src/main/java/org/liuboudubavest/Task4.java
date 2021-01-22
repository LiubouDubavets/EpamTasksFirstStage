package org.liuboudubavest;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public void calc() throws IOException {
        int summary = 0;
        int multiplication = 1;
        System.out.println("Please, insert random numbers separated by space.");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        for (String s : line.split(" ")) {
            summary = summary + Integer.parseInt(s);
            multiplication = multiplication * Integer.parseInt(s);
        }
        System.out.println("Summary of numbers is: " +summary+
                "\nMultiplication result is: "+ multiplication);
    }
}