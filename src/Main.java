import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Knight's Tour implemented for user interaction.
 */
public class Main extends JFrame {
    public Main() {
        // Set program's title
        super("Knight's Tour: Manual Version");
        Container contents = getContentPane();
        contents.setLayout(new GridLayout(8, 8));
        // Add Menu Bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        // Add Menu Option
        JMenu game = new JMenu("Game");
        menuBar.add(game);
        // Add Restart option
        JMenuItem restart = new JMenuItem("New Game");
        game.add(restart);
        restart.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose();
                new Main();
            }
        }));

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
    }

    public static void main(String[] args) {
        new Main();
    }
}