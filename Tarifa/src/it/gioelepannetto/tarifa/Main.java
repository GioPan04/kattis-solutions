package it.gioelepannetto.tarifa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    final Scanner input = new Scanner(System.in);
        final int monthlyMb = input.nextInt();
        final int months = input.nextInt();

        int[] usedMb = new int[months];
        for (int i = 0; i < months; i++) {
            usedMb[i] = input.nextInt();
        }

        final Tarifa tarifa = new Tarifa(monthlyMb, months, usedMb);
        System.out.println(tarifa.getRemainingMb());
    }
}
