package org.liuboudubavest;
import java.util.ArrayList;
import java.util.Scanner;

public class OptionalTask4 {
    public void fourthOptionalTask(){
        int i, numberWithMinDifferentElements, minElements, numberOfElementsInNumber;
        System.out.println("Please, insert numbers separated by space:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : line.split(" ")) {
            if(s.length()!=0)
                numbers.add(Integer.parseInt(s));
        }
        System.out.println("Array of elements: "+ numbers);
        minElements = countingOfDifferentElements(numbers.get(0));
        numberWithMinDifferentElements = numbers.get(0);
        for (i = 1; i < numbers.size(); i++) {
            numberOfElementsInNumber = countingOfDifferentElements(numbers.get(i));
            if (numberOfElementsInNumber < minElements) {
                minElements = numberOfElementsInNumber;
                numberWithMinDifferentElements = numbers.get(i);
            }
        }
        System.out.println("The first element from array with minimum different digits: "+
                numberWithMinDifferentElements + ".");
    }
    public static int countingOfDifferentElements(int number) {
        int [] digits = {0,0,0,0,0,0,0,0,0,0};
        int i, j=0;
        if (number==0)
            return 1;
        while(number>0) {
            i = number % 10;
            digits[i]++;
            number = number / 10;
        }
        for (i=0; i<10; i++)
            if (digits[i] > 0)
                j++;
        return j;
    }
}
