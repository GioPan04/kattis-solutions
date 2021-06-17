package it.gioelepannetto.differentdirections;

public class Vector2 {
    public double x;
    public double y;
    public double angle;

    public Vector2 (final double x, final double y, final double angle) {
        this.x = x;
        this.y = y;
        this.angle = angle;
    }

    public void move(final double distance) {
        this.x += distance * Math.cos(Math.toRadians(angle));
        this.y += distance * Math.sin(Math.toRadians(angle));
    }

    static Vector2 average(Vector2... vectors) {
        double totalX = 0, totalY = 0, angle = 0;
        int total = 0;

        for(Vector2 vector: vectors) {
            totalX += vector.x;
            totalY += vector.y;
            angle  += vector.angle;
            total++;
        }

        return new Vector2(totalX / total, totalY / total, angle / total);
    }

    public static double distance(Vector2 first, Vector2 second) {
        double x = Math.pow(second.x - first.x, 2);
        double y = Math.pow(second.y - first.y, 2);
        return Math.sqrt(x + y);
    }
}
