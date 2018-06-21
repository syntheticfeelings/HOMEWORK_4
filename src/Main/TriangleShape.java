package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class TriangleShape extends Shape {

    public TriangleShape(GraphicsContext GC, List<Shape> shapes) {
        super(GC, shapes);
    }

    @Override
    public void draw() {
        GC.setFill(Color.BLACK);
        GC.fillOval(x, y, diameter - 15, diameter + 10);
    }

    @Override
    public void drawField() {
        GC.setStroke(Color.YELLOW);
        GC.setLineWidth(4);
        GC.strokeOval(x, y, diameter - 15, diameter + 10);

    }
}
