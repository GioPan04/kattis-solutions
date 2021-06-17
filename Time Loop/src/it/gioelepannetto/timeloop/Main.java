package it.gioelepannetto.timeloop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    final Scanner input = new Scanner(System.in);
	    final int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d Abracadabra%n", i);
        }
    }
}
