package org.liuboudubavest;
import java.util.Scanner;

public class OptionalTask2 {

    public void secondOptionalTask() {
        double summary=0;
        double counter=0;
        double medium;
        int mediumInteger;

        System.out.println("Please, insert numbers separated by space:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        for (String s : line.split(" ")) {
            if (s.length() != 0) {
                summary = summary + s.length();
                counter++;
            }
        }
        medium=summary/counter;
        mediumInteger = (int) Math.round(medium);
        System.out.println("Medium length of insert numbers is: "+mediumInteger);
        for (String s : line.split(" ")) {
            if (s.length()<mediumInteger && s.length()!=0){
                System.out.println("'"+ Integer.parseInt(s) + "' is shorter than medium length. Its length is " + s.length());
            }
            if (s.length()>mediumInteger && s.length()!=0){
                System.out.println("'"+ Integer.parseInt(s) + "' is longer than medium length. Its length is " + s.length());
            }
        }
    }
}
