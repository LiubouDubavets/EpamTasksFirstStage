package org.liuboudubavest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OptionalTask3 {
    public void thirdOptionalTask() {
        System.out.println("Please, insert numbers separated by space:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : line.split(" ")) {
            if (s.length() != 0)
                numbers.add(Integer.parseInt(s));
        }
        System.out.println("Array of elements: "+ numbers);
        Collections.sort(numbers);
        System.out.println("Array of elements sorted by length (up order): "+ numbers);
        Collections.reverse(numbers);
        System.out.println("Array of elements sorted by length (down order): "+ numbers);
    }
}