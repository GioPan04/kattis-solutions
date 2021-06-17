package it.gioelepannetto.stopwatch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    final Scanner input = new Scanner(System.in);
	    final int nPressed = input.nextInt();
	    int[] t = new int[nPressed];

        for (int i = 0; i < nPressed; i++) {
            t[i] = input.nextInt();
        }

        if(nPressed % 2 != 0) {
            System.out.println("still running");
            return;
        }

        int result = 0;
        for(int i = 0; i < nPressed; i += 2) {
            result += t[i+1] - t[i];
        }

        System.out.println(result);
    }
}
