package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class BallShape extends Shape {

    public BallShape(GraphicsContext gc) {
        super(gc);
    }

    public void draw() {
        GC.setFill(Color.RED);
        GC.fillOval(x, y, diameter, diameter);
    }
}
