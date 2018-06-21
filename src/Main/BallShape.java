package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class BallShape extends Shape {

    public BallShape(GraphicsContext GC, List<Shape> shapes) {
        super(GC, shapes);
    }


    public void draw() {
        GC.setFill(Color.RED);
        GC.fillOval(x, y, diameter, diameter);
    }

    @Override
    public void drawField() {
        GC.setStroke(Color.YELLOW);
        GC.setLineWidth(4);
        GC.strokeOval(x, y, diameter, diameter);
    }
}
