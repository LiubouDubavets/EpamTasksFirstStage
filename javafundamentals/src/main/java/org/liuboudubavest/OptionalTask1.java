package org.liuboudubavest;
import java.util.Scanner;

public class OptionalTask1 {
    public void firstOptionalTask() {
        System.out.println("Please, insert numbers separated by space:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String longNumber = "", shortNumber = line;
        for (String s : line.split(" ")) {
            if (s.length() > longNumber.length()) longNumber = s;
            if (s.length() < shortNumber.length() && s.length()!=0) shortNumber = s;
        }
        System.out.println("The first longest number in the line: '" + Integer.parseInt(longNumber) +
                "'\nLength: " + longNumber.length()+"\nThe first shortest number in the line: '" +
                Integer.parseInt(shortNumber) + "'\nLength: " + shortNumber.length());
    }
}
