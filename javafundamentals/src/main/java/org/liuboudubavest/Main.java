package org.liuboudubavest;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Please, choose task to be done:\n " +
                ">> 1 Greeting\n " +
                ">> 2 Reverse text\n " +
                ">> 3 Random numbers\n " +
                ">> 4 Calculate summary and multiplicity of numbers\n " +
                ">> 5 Month by number\n " +
                ">> 6 First longest and first shortest numbers in the line\n " +
                ">> 7 Numbers in order\n " +
                ">> 8 Write numbers longer/shorter than medium length\n " +
                ">> 9 First number with min different digits\n " +
                ">> 10 Count numbers consists only with even digits and numbers with equally even and odd digits\n " +
                ">> 11 First number with digits in order\n " +
                ">> 12 First number consists with different digits only ");

        Scanner input = new Scanner(System.in);
        String x = input.next();

        switch(x){
            case "1": {
                Task1 task1 = new Task1();
                task1.greetings();
                break;
            }
            case "2":{
                Task2 task2 = new Task2();
                task2.reverse();
                break;
            }
            case "3":{
                Task3 task3 = new Task3();
                task3.randomNumbers();
                break;
            }
            case "4":{
                Task4 task4 = new Task4();
                task4.calc();
                break;
            }
            case "5":{
                Task5 task5 = new Task5();
                task5.month();
                break;
            }
            case "6":{
                OptionalTask1 optionalTask1 = new OptionalTask1();
                optionalTask1.firstOptionalTask();
                break;
            }
            case "7":{
                OptionalTask3 optionalTask3 = new OptionalTask3();
                optionalTask3.thirdOptionalTask();
                break;
            }
            case "8":{
                OptionalTask2 optionalTask2 = new OptionalTask2();
                optionalTask2.secondOptionalTask();
                break;
            }
            case "9":{
                OptionalTask4 optionalTask4 = new OptionalTask4();
                optionalTask4.fourthOptionalTask();
                break;
            }
            case "10":{
                OptionalTask5 optionalTask5 = new OptionalTask5();
                optionalTask5.fifthOptionalTask();
                break;
            }
            case "11":{
                OptionalTask6 optionalTask6 = new OptionalTask6();
                optionalTask6.sixthOptionalTask();
                break;
            }
            case "12":{
                OptionalTask7 optionalTask7 = new OptionalTask7();
                optionalTask7.seventhOptionalTask();
                break;
            }
        }
    }
}