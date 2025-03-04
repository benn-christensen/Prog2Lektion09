package opgave05.application;

import javafx.beans.property.StringProperty;
import javafx.scene.input.MouseButton;
import opgave05.application.model.Board;
import opgave05.application.model.Point;

public class Controller {
    private static Board board = new Board(9, 10);
    public static void handle(Point point, MouseButton button) {
        if (button == MouseButton.SECONDARY && board.getField(point).equals(" ")) {
            board.setField(point, "F");
            return;
        }
    }
    public static StringProperty getField(int x, int y) {
        return board.getField(x, y);
    }

    public static Board getBoard() {
        return board;
    }
}
