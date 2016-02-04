import javax.swing.*;
import java.awt.*;

public class SizeCounterLabel extends JLabel{
    private int size;

    public SizeCounterLabel(){
        size = Snake.START_SNAKE_SIZE;
        initSizeCounterLabel();
        paintSize();
    }

    public void initSizeCounterLabel(){
        setOpaque(false);
        setForeground(new Color(0xFFFFFF));
        setFont(new Font("Segoe Print", Font.PLAIN, 19));
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }

    public void incrementSnakeSize(){
        size++;
        paintSize();
    }

    private void paintSize(){
        setText(" Длинна змейки: " + size);
    }

    public void clear(){
        size = Snake.START_SNAKE_SIZE;
        paintSize();
    }
}