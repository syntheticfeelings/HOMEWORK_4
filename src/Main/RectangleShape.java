package Main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RectangleShape extends Shape {


    public RectangleShape(GraphicsContext gc) {
        super(gc);
    }

    @Override
    public void draw() {
        GC.setFill(Color.BLUE);
        GC.fillRect(x + 120, y + 100, diameter, diameter);
    }
}
