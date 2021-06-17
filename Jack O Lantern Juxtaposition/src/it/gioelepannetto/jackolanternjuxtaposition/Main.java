package it.gioelepannetto.jackolanternjuxtaposition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int n = input.nextInt();
        final int t = input.nextInt();
        final int m = input.nextInt();

        System.out.println(n * t * m);
    }
}
