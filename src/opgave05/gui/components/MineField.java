package opgave05.gui.components;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import opgave05.application.Controller;
import opgave05.application.model.Point;

public class MineField extends GridPane {
    public MineField(int size) {
        this.setHgap(2);
        this.setVgap(2);
        this.setGridLinesVisible(false);
        for (int outer = 0; outer < size; outer++) {
            for (int inner = 0; inner < size; inner++) {
                Label label = new Label();
                label.getStyleClass().add("field");
                label.setMaxWidth(50);
                label.setMaxHeight(50);
                label.setMinWidth(50);
                label.setMinHeight(50);
                label.setAlignment(Pos.CENTER);
                label.setFont(Font.font(20));
                label.setUserData(new Point(inner, outer));
                label.textProperty().bind(Controller.getField(inner, outer));
                label.setOnMouseClicked(event
                        -> Controller.handle((Point)((Label)event.getSource()).getUserData(), event.getButton()));
                this.add(label, inner, outer);
            }
        }
    }
}
