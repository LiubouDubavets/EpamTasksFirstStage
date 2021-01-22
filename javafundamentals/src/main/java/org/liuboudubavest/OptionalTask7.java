package org.liuboudubavest;
import java.util.ArrayList;
import java.util.Scanner;

public class OptionalTask7 {
    public void seventhOptionalTask(){
        System.out.println("Please, insert numbers separated by space:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : line.split(" ")) {
            if (s.length() != 0)
                numbers.add(Integer.parseInt(s));
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (allDifferentDigits(numbers.get(i))) {
                System.out.println("Element from array that consists of all different digits: " + numbers.get(i));
                break;
            }
        }
    }
    public boolean allDifferentDigits(Integer number) {
        int digit;
        while (number > 0) {
            digit = number % 10;
            for (int i = number / 10; i > 0; i /= 10) {
                if (i % 10 == digit)
                    return false;
            }
            number /= 10;
        }
        return true;
    }
}
