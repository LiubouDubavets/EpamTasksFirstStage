package org.liuboudubavest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task1 {
    public void greetings () throws IOException {
        System.out.println("Please, insert your first name:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Hello, "+name.substring(0, 1).toUpperCase() + name.substring(1)+"!");
    }
}