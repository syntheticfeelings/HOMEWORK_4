package Main;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {
    protected final GraphicsContext GC;
    protected double x;
    protected double y;

    protected int diameter = 50;

    public Shape(GraphicsContext gc) {
        this.GC = gc;
        x = 30;
        y = 30;
    }

    double MAX_X = 1200;
    double MAX_Y = 700;

    public void moveUp() {
        y -= 10;
        if (y <= 0 || y + diameter >= MAX_Y) {
            y += 10;
        }
    }

    public void moveDown() {
        y += 10;
        if (y <= 0 || y + diameter >= MAX_Y) {
            y -= 10;
        }
    }

    public void moveLeft() {
        x -= 10;
        if (x <= 0 || x + diameter >= MAX_X) {
            x += 10;
        }
    }

    public void moveRight() {
        x += 10;
        if (x <= 0 || x + diameter == MAX_X) {
            x -= 10;
        }
    }

    public abstract void draw();
}
