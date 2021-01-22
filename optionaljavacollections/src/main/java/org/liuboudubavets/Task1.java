package org.liuboudubavets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task1 {

    public static void sortedList(String filePath) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        new BufferedReader(new FileReader(filePath)).lines().forEach(list::add);
        Collections.sort(list);
        printSortedList(list);

    }
    public static void printSortedList(ArrayList<String> list){
        for (String string:list){
            System.out.println(string);
        }
    }
}
