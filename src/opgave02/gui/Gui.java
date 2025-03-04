package opgave02.gui;

import opgave02.gui.components.MineField;
import opgave02.gui.components.TopPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {
    private static final int SIZE = 9;
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane);
        scene.getStylesheets().add("css/stylesheet.css");
        initContent(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initContent(GridPane gridPane) {
        gridPane.add(new TopPane(), 0, 0);
        gridPane.add(new MineField(SIZE), 0, 1);
    }
}
