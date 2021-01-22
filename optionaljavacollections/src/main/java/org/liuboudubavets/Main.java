package org.liuboudubavets;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Hello!\n > What optional task from Java Collections course " +
                "you would like to run? \n >> 1 - record strings from file to ArrayList and use function sort() \n " +
                ">> 2 - record words from text file to HashSet and get all different words, that are used in this text" +
                "\n >> 3 - check if all braces in the written string were closed");
        Scanner scan = new Scanner(System.in);
        String choosingOfSorting = scan.nextLine();
        switch (choosingOfSorting) {
            case "1": {
                Task1.sortedList("optionaljavacollections/resources/poem.txt");
                break;
            }
            case "2": {
                Task2.differentWords();
                break;
            }
            case "3":{
                Task3.returnStatement();
                break;
            }
        }
    }
}