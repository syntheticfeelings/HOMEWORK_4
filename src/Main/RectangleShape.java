package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class RectangleShape extends Shape {


    public RectangleShape(GraphicsContext GC, List<Shape> shapes) {
        super(GC, shapes);
    }

    @Override
    public void draw() {
        GC.setFill(Color.BLUE);
        GC.fillRect(x, y, diameter, diameter);
    }

    @Override
    public void drawField() {
        GC.setStroke(Color.YELLOW);
        GC.setLineWidth(4);
        GC.strokeRect(x, y, diameter, diameter);
    }
}
