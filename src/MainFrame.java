import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {
    private GameBoard gameBoard;

    public MainFrame(){
        initMainFrame();
        initGameBoard();
        initActionListenerForSnake();
    }

    private void initMainFrame(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(665, 670);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Змейка минимализм. Ничего лишнего.");
    }

    private void initGameBoard(){
        gameBoard = new GameBoard();
        add(gameBoard, BorderLayout.CENTER);
    }

    private void initActionListenerForSnake(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("there");
            }
        });
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}