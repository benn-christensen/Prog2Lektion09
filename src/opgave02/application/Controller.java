package opgave02.application;

import javafx.beans.property.StringProperty;
import javafx.scene.input.MouseButton;
import opgave02.application.model.Board;
import opgave02.application.model.Point;

public class Controller {
    private static Board board = new Board(9, 10);
    public static void handle(Point point, MouseButton button) {
        if (button == MouseButton.SECONDARY && board.getField(point).equals(" ")) {
            board.setField(point, "\uD83D\uDEA9");
            board.getRemainingMinesProperty().set(board.getRemainingMinesProperty().get() - 1);
            return;
        }

        if (button == MouseButton.SECONDARY && board.getField(point).equals("\uD83D\uDEA9")) {
            board.setField(point, " ");
            board.getRemainingMinesProperty().set(board.getRemainingMinesProperty().get() + 1);
            return;
        }


        if (board.containsMine(point)) {
            board.setField(point, "M");
            return;
        }
        board.adjacentMines(point);
    }
    public static StringProperty getField(int x, int y) {
        return board.getField(x, y);
    }

    public static Board getBoard() {
        return board;
    }
}
