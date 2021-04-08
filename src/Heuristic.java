import java.awt.*;
import javax.swing.*;

/**
 * Knight's Tour implemented with a basic heuristic approach.
 */
public class Heuristic extends JFrame {
    public Heuristic() {
        super("Knight's Tour: Heuristic Version");
        Container contents = getContentPane();
        contents.setLayout(new GridLayout(8, 8));

        Board chessboard = new Board();

        for (int row = 0; row < Board.BOARD_SIZE; row++) {
            for (int column = 0; column < Board.BOARD_SIZE; column++) {
                contents.add(chessboard.getTile(row, column));
            }
        }

        setSize(600, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        for (int row = 0; row < Board.BOARD_SIZE; row++) {
            for (int column = 0; column < Board.BOARD_SIZE; column++) {
                chessboard.runTour(row, column, false);
                chessboard.resetBoard();
            }
        }
    }

    public static void main(String[] args) {
        new Heuristic();
    }
}