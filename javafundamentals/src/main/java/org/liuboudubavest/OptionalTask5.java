package org.liuboudubavest;
import java.util.ArrayList;
import java.util.Scanner;

public class OptionalTask5 {
    public void fifthOptionalTask(){
        int counterEvenDigits=0;
        int counterOddDigits=0;
        int counterOfEvenNumbers = 0;
        int counterOfEquallyEvenAndOdd = 0;

        System.out.println("Please, insert numbers separated by space:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : line.split(" ")) {
            if(s.length()!=0)
                numbers.add(Integer.parseInt(s));
        }
        for (int i = 0; i < numbers.size(); i++) {
            ArrayList<Integer> digits = new ArrayList<>();
            while (numbers.get(i) != 0) {
                digits.add(numbers.get(i) % 10);
                numbers.set(i, numbers.get(i)/10);
            }
            for (int j = 0; j < digits.size(); j++) {
                if (digits.get(j) % 2 == 0)
                    counterEvenDigits++;
                else counterOddDigits++;
            }
            if (counterEvenDigits == digits.size())
                counterOfEvenNumbers++;
            else if (counterEvenDigits == counterOddDigits)
                counterOfEquallyEvenAndOdd++;
            counterEvenDigits = 0;
            counterOddDigits = 0;
        }
        System.out.println("Number of elements with even digits only: " + counterOfEvenNumbers +
                "\nNumber of elements with equally even and odd digits: " + counterOfEquallyEvenAndOdd);
    }
}
