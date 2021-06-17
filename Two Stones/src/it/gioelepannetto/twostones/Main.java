package it.gioelepannetto.twostones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    final Scanner input = new Scanner(System.in);
	    final int n = input.nextInt();
	    System.out.println(n % 2 == 0 ? "Bob" : "Alice");
    }
}
