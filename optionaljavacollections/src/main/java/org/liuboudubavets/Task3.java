package org.liuboudubavets;

import java.util.Scanner;
import java.util.Stack;

public class Task3 {

    static class CheckBrackets {
        boolean checkBrackets(String expression) {
            boolean correct;
            Stack<Character> stack = new Stack<>();
            if (correct = expression != null) {
                for (char symbol : expression.toCharArray()) {
                    if (symbol == '(' || symbol == '[' || symbol == '{') {
                        stack.push(symbol);
                    } else if (symbol == ')' || symbol == ']' || symbol == '}') {
                        if (stack.empty()) {
                            correct = false;
                            break;
                        } else {
                            char bracket = stack.pop();
                            if (!checkReverseBracket(bracket, symbol)) {
                                correct = false;
                                break;
                            }
                        }
                    }
                }
                correct = correct && stack.empty();
            }
            return correct;
        }

        private boolean checkReverseBracket(char on, char off) {
            return (on == '(' && off == ')') || (on == '[' && off == ']') || (on == '{' && off == '}');
        }
    }

    public static void returnStatement() {
        System.out.println("Please, fill string with braces to check the result if all of them are closed.\n" +
                    " You can use any kind of them: (, ), {, }, [, ]");
        Scanner scan = new Scanner(System.in);
        String braces = scan.nextLine();
        CheckBrackets check = new CheckBrackets();
        System.out.printf("expression: %-10s result: %s;\n", braces, check.checkBrackets(braces));
    }
}

