package it.gioelepannetto.differentdirections;

public class Instruction {

    public final Type type;
    public final double argument;

    public Instruction(final String type, final double argument) {
        this.type = Type.parse(type);
        this.argument = argument;
    }

    @Override
    public String toString() {
        return String.format("Instruction{type=%s,argument=%s}", type, argument);
    }

    public enum Type {
        start, walk, turn;

        public static Type parse(final String input) {
            switch (input.toLowerCase()) {
                case "start":
                    return start;
                case "walk":
                    return  walk;
                case "turn":
                    return turn;
                default:
                    throw new RuntimeException();
            }
        }
    }
}
