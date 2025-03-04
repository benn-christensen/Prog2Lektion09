package opgave06.gui.components;

import javafx.beans.binding.Bindings;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import opgave06.application.Controller;

public class TopPane extends HBox {
    public TopPane() {
        Label remainingMinesLabel = new Label();
        remainingMinesLabel.textProperty().bind(
                Bindings.createStringBinding(() -> Integer.toString(Controller.getBoard().getRemainingMinesProperty().get()), Controller.getBoard().getRemainingMinesProperty())
        );
        this.getChildren().add(remainingMinesLabel);
    }
}
