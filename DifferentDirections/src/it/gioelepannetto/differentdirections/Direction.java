package it.gioelepannetto.differentdirections;

public class Direction {
    public final Vector2 initialPosition;

    public Direction(final Vector2 position) {
        this.initialPosition = position;
    }

    public static Direction fromInput(final String[] data) {
        final double x = Double.parseDouble(data[0]);
        final double y = Double.parseDouble(data[1]);

        final Vector2 vector2 = new Vector2(x, y, 0);

        return new Direction(vector2);
    }

    public static Direction fromInput(final String input) {
        return fromInput(input.split(" "));
    }

    public Vector2 navigate(final Instruction[] instructions) {
        Vector2 destination = new Vector2(initialPosition.x, initialPosition.y, initialPosition.angle);

        for (Instruction instruction : instructions) {
            switch (instruction.type) {
                case start:
                    destination.angle = instruction.argument;
                    break;
                case turn:
                    destination.angle += instruction.argument;
                    break;
                case walk:
                    destination.move(instruction.argument);
                    break;
            }
        }

        return destination;
    }
}
