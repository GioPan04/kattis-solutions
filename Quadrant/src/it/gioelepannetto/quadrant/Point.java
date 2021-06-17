package it.gioelepannetto.quadrant;

public class Point {
    final public int x;
    final public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getQuadrant() {
        if(x > 0) {
            // Can be on 1 or 4
            return y > 0 ? 1 : 4;
        } else {
            // Can be on 2 or 3
            return y > 0 ? 2 : 3;
        }
    }
}
