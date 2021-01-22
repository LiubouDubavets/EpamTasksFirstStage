package org.liuboudubavest;
import java.util.ArrayList;
import java.util.Scanner;

public class OptionalTask6 {

    public void sixthOptionalTask() {
        System.out.println("Please, insert numbers separated by space:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : line.split(" ")) {
            if (s.length() != 0)
                numbers.add(Integer.parseInt(s));
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (digitsInUpOrder(numbers.get(i))) {
                System.out.println("Element from array with the right order: " + numbers.get(i));
                break;
            }
        }
    }
    public static boolean digitsInUpOrder(int number) {
        boolean flag = true;
        int previousDigit = -1;

        while(number != 0) {
            if (previousDigit == -1) {
                previousDigit = number % 10;
                number = number / 10;
                continue;
            }
            if (previousDigit == number % 10) {
                flag = false;
                break;
            }
            if (previousDigit < number % 10) {
                flag = false;
                break;
            }
            if (previousDigit > ((number % 10)+1)){
                flag = false;
                break;
            }
            previousDigit = number % 10;
            number = number / 10;
        }
        return flag;
    }
}

