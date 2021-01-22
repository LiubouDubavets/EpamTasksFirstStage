package org.liuboudubavest;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public void reverse() throws IOException {
        System.out.println("Please, insert text:");
        Scanner text = new Scanner(System.in);
        StringBuffer readReverse = new StringBuffer(text.nextLine());
        readReverse.reverse();
        System.out.println("Reverse text: "+readReverse.toString());
    }
}