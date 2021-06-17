package it.gioelepannetto.differentdirections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            final int nTestCases = Integer.parseInt(input.nextLine());

            Vector2[] vector2s = new Vector2[nTestCases];

            for (int i = 0; i < nTestCases; i++) {
                final String[] data = input.nextLine().split(" ");
                final Direction direction = Direction.fromInput(data);
                ArrayList<Instruction> instructions = new ArrayList<>();

                for(int j = 2; j < data.length; j += 2) {
                    final String type = data[j];
                    final double value = Double.parseDouble(data[j+1]);
                    instructions.add(new Instruction(type, value));
                }

                vector2s[i] = direction.navigate(instructions.toArray(new Instruction[0]));
            }

            if(nTestCases > 0) {
                final Vector2 average = Vector2.average(vector2s);

                double minDistance = 0;
                for (int i = 0; i < nTestCases; i++) {
                    final double distance = Vector2.distance(vector2s[i], average);
                    if (distance > minDistance) minDistance = distance;
                }

                System.out.printf("%.2f %.2f %.2f%n", average.x, average.y, minDistance);
            }
        }
    }
}
