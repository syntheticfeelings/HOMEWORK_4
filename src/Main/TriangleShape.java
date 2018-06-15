package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class TriangleShape extends Shape {

    public TriangleShape(GraphicsContext gc) {
        super(gc);
    }

    @Override
    public void draw() {
        GC.setFill(Color.BLACK);
        GC.fillOval(x, y + 100, diameter-15, diameter+10);
    }
}
