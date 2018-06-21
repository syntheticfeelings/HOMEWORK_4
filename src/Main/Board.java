package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final GraphicsContext GC;
    Shape shape;
    Shape shape1;
    Shape shape2;
    List<Shape> shapes = new ArrayList<Shape>();


    public Board(GraphicsContext gc) {
        GC = gc;
        shape = new BallShape(gc, shapes);
        shape1 = new RectangleShape(gc, shapes);
        shape2 = new TriangleShape(gc, shapes);
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
                shape.nextShape();
                shape.drawField();
                draw();
                break;
            case PAGE_DOWN:
                shape.prevShape();
                shape.drawField();
                draw();
                break;
            case NUMPAD1:
                shapes.add(new BallShape(GC, shapes));
                draw();
                break;
            case NUMPAD2:
                shapes.add(new RectangleShape(GC, shapes));
                draw();
                break;
            case NUMPAD3:
                shapes.add(new TriangleShape(GC, shapes));
                draw();
                break;
            case W:
                shape.diameter += 10;
                shape.drawField();
                draw();
                break;
            case Q:
                shape.diameter -= 10;
                draw();
                break;
            case RIGHT:
                shape.moveRight();
                draw();
                break;
            case LEFT:
                shape.moveLeft();
                draw();
                break;
            case DOWN:
                shape.moveDown();
                draw();
                break;
            case UP:
                shape.moveUp();
                draw();
                break;
        }
    }

    public void draw() {
        clean();
        for (Shape shape : shapes) {
            shape.draw();
        }
        shapes.get(shape.indexShape).drawField();
    }


    private void clean() {
        GC.clearRect(0, 0, GC.getCanvas().getWidth(), GC.getCanvas().getHeight());
        GC.setFill(Color.LIGHTGRAY);
        GC.fillRoundRect(0, 0, GC.getCanvas().getWidth(), GC.getCanvas().getHeight(), 0, 0);
    }
}
