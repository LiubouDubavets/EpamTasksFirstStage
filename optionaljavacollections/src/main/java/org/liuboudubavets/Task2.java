package org.liuboudubavets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {

    public static void differentWords() {
        Task2 task2 = new Task2();
        TreeSet<String> treeSet =
                new TreeSet<String>(task2.toSeparatedSet(task2.setFromFile("optionaljavacollections/resources/poem.txt")));
            System.out.println(treeSet);
    }

   public Set<String> setFromFile(String filePath) {
       Set<String> set = new HashSet<>();
       try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
           String line;
           while ((line = reader.readLine()) != null) {
               set.add(line);
           }
       } catch (FileNotFoundException e1) {
           e1.printStackTrace();
       } catch (IOException e1) {
           e1.printStackTrace();
       }
       System.out.println(set);
       return set;
   }

    public Set<String> toSeparatedSet(Set<String> set) {
       Set<String> separatedSet = new HashSet<>();
        for (String line : set) {
            String words[] = line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
            for (String word : words) {
                if (!separatedSet.equals(word)) {
                    separatedSet.add(word);
                }
            }
        }
        return separatedSet;
    }
}


