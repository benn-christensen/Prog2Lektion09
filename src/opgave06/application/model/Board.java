package opgave06.application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Random;

public class Board {
    private StringProperty[][] board;
    private boolean[][] isMine;
    private IntegerProperty remainingMines = new SimpleIntegerProperty();

    public Board(int size, int numberOfMines) {
        remainingMines.set(numberOfMines);
        board = new StringProperty[size][size];
        for (int outer = 0; outer < size; outer++) {
            for (int inner = 0; inner < size; inner++) {
                board[inner][outer] = new SimpleStringProperty();
                board[inner][outer].set(" ");
            }
        }
        isMine = new boolean[size][size];
        Random random = new Random();
        while (numberOfMines > 0) {
            int x = random.nextInt(size);
            int y = random.nextInt(size);
            if (!isMine[x][y]) {
                isMine[x][y] = true;
                numberOfMines--;
            }
        }

    }

    public StringProperty getField(int x, int y) {
        return board[x][y];
    }

    public IntegerProperty getRemainingMinesProperty() {
        return remainingMines;
    }

    public String getField(Point point) {
        return board[point.getX()][point.getY()].get();
    }

    public void setField(Point point, String value) {
        board[point.getX()][point.getY()].set(value);
    }

    public boolean containsMine(Point point) {
        return isMine[point.getX()][point.getY()];
    }

    public int adjacentMines(Point point) {
        if (!getField(point).equals(" ")) return 0;
        int number = 0;
        int[] mod = {-1, 0, 1};
        for (int y = 0; y < mod.length; y++) {
            for (int x = 0; x < mod.length; x++) {
                int xmod = point.getX() + mod[x];
                int ymod = point.getY() + mod[y];
                if ((xmod >= 0 && xmod < isMine.length
                        && ymod >= 0 && ymod < isMine.length)
                        && isMine[xmod][ymod]) {
                    number++;
                }
            }
        }
        if (getField(point).equals(" ")) {
            setField(point, String.valueOf(number));
        }
        if (number == 0) {
            for (int y = 0; y < mod.length; y++) {
                for (int x = 0; x < mod.length; x++) {
                    int xmod = point.getX() + mod[x];
                    int ymod = point.getY() + mod[y];
                    if ((xmod >= 0 && xmod < isMine.length
                            && ymod >= 0 && ymod < isMine.length)) {
                        adjacentMines(new Point(xmod, ymod));
                    }
                }
            }
        }
        return number;
    }
}
