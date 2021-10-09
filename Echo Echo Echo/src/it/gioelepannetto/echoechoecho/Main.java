package it.gioelepannetto.echoechoecho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    final String word = new Scanner(System.in).nextLine();
	    System.out.println((word + " ").repeat(3));
    }
}
