package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 700;

    private GraphicsContext gc;

    Board board;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("SimpleGame");
        Canvas canvas = new Canvas();
        board = new Board(canvas.getGraphicsContext2D());
        canvas.setWidth(WIDTH);
        canvas.setHeight(HEIGHT);
        BorderPane group = new BorderPane(canvas);
        Scene scene = new Scene(group);
        scene.setOnKeyPressed(event -> board.keyPressed(event.getCode()));
        primaryStage.setScene(scene);
        primaryStage.show();
        drawFrame();
    }


    public static void main(String[] args) {
        launch(args);
    }


    private void drawFrame() {
        board.draw();
        board.renderNextFrame();
    }
}
