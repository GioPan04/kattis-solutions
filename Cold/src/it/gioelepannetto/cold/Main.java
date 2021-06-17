package it.gioelepannetto.cold;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    final Scanner input = new Scanner(System.in);
	    final int n = Integer.parseInt(input.nextLine());

	    int belowZero = 0;

	    for(int i = 0; i < n; i++) {
	        final int temp = input.nextInt();
	        if(temp < 0) belowZero++;
        }

	    System.out.println(belowZero);
    }
}
