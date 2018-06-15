package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Board {
    private final GraphicsContext GC;
    Shape shape;
    Shape shape1;
    Shape shape2;
    ArrayList<Shape> shapes = new ArrayList<Shape>();


    public Board(GraphicsContext gc) {
        GC = gc;
        shape = new BallShape(gc);
        shape1 = new RectangleShape(gc);
        shape2 = new TriangleShape(gc);
        shapes.add(shape);
        shapes.add(shape1);
        shapes.add(shape2);
    }

    public void renderNextFrame() {
        shape.moveUp();
    }

    public void keyPressed(KeyCode code) {
        switch (code) {
            case PAGE_UP:
                Shape shape3 = new BallShape(GC);
                shapes.add(shape3);
                draw();
                break;
            case W:
                for (Shape shape : shapes) {
                    shape.diameter += 10;
                }
                draw();
                break;
            case Q:
                for (Shape shape : shapes) {
                    shape.diameter -= 10;
                }
                draw();
                break;

            case RIGHT:
                for (Shape shape : shapes) {
                    shape.moveRight();
                }
                draw();
                break;
            case LEFT:
                for (Shape shape : shapes) {
                    shape.moveLeft();
                }
                draw();
                break;
            case DOWN:
                for (Shape shape : shapes) {
                    shape.moveDown();
                }
                draw();
                break;
            case UP:
                for (Shape shape : shapes) {
                    shape.moveUp();
                }
                draw();
                break;
        }
    }

    public void draw() {
        clean();
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    private void clean() {
        GC.clearRect(0, 0, GC.getCanvas().getWidth(), GC.getCanvas().getHeight());
        GC.setFill(Color.LIGHTGRAY);
        GC.fillRoundRect(0, 0, GC.getCanvas().getWidth(), GC.getCanvas().getHeight(), 0, 0);
    }
}
