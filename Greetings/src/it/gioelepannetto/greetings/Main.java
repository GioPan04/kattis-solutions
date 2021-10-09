package it.gioelepannetto.greetings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String input = new Scanner(System.in).nextLine();
        String hey = input.replace("h", "").replace("y", "");
        hey = hey + "e".repeat(hey.length());
        System.out.println("h" + hey + "y");
    }
}
