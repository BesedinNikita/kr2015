import java.awt.*;
import java.util.Random;

public class Apple {
    private static Random random = new Random();
    private Point currentCoordinate;

    public void generateApple(Square [][] field){
        int maxCoordinate = field.length;

        int x, y;
        do{
            x = random.nextInt(maxCoordinate);
            y = random.nextInt(maxCoordinate);
        } while (field[y][x].getSquareState() != Square.SquareState.NORMAL);

        currentCoordinate = new Point(x, y);
        field[y][x].makeApple();
    }

    public Point getCurrentPoint(){
        return currentCoordinate;
    }

    public int getCurrentX(){
        return currentCoordinate.x;
    }

    public int getCurrentY(){
        return currentCoordinate.y;
    }
}