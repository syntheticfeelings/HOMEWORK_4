package Main;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    protected final GraphicsContext GC;
    protected double x;
    protected double y;

    protected int diameter = 50;

    protected int indexShape;

    protected List<Shape> shapes = new ArrayList<Shape>();

    public Shape(GraphicsContext GC, List<Shape> shapes) {
        this.GC = GC;
        this.shapes = shapes;
    }


    double MAX_X = 1200;
    double MAX_Y = 700;

    public void nextShape() {
        indexShape++;
        if (indexShape == shapes.size()) {
            indexShape = 0;
        }
    }

    public void prevShape() {
        indexShape--;
        if (indexShape < 0) {
            indexShape = shapes.size() - 1;
        }
    }


    public void moveUp() {
        shapes.get(indexShape).y -= 10;
        if (shapes.get(indexShape).y <= 0 || shapes.get(indexShape).y + diameter >= MAX_Y) {
            shapes.get(indexShape).y += 10;
        }
    }

    public void moveDown() {
        shapes.get(indexShape).y += 10;
        if (shapes.get(indexShape).y <= 0 || shapes.get(indexShape).y + diameter >= MAX_Y) {
            shapes.get(indexShape).y -= 10;
        }
    }

    public void moveLeft() {
        shapes.get(indexShape).x -= 10;
        if (shapes.get(indexShape).x <= 0 || shapes.get(indexShape).x + diameter >= MAX_X) {
            shapes.get(indexShape).x += 10;
        }
    }

    public void moveRight() {
        shapes.get(indexShape).x += 10;
        if (shapes.get(indexShape).x <= 0 || shapes.get(indexShape).x + diameter == MAX_X) {
            shapes.get(indexShape).x -= 10;
        }
    }

    public abstract void draw();

    public abstract void drawField();
}
