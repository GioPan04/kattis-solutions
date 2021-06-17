package it.gioelepannetto.quadrant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        final int x = Integer.parseInt(input.nextLine());
        final int y = Integer.parseInt(input.nextLine());

        System.out.println(new Point(x, y).getQuadrant());
    }
}
