import java.awt.*;

public class SnakePart {
    private Point point;
    private State partState;

    public SnakePart(Point startPoint, State partState){
        this.point = startPoint;
        this.partState = partState;
    }

    public SnakePart(Point startPoint){
        this(startPoint, State.BODY);
    }

    public SnakePart(int x, int y){
        this(new Point(x, y));
    }

    public void makeHead(){
        partState = State.HEAD;
    }

    public void makeBody(){
        partState = State.BODY;
    }

    public void setPoint(Point point){
        this.point = point;
    }

    public Point getPoint(){
        return point;
    }

    public SnakePart clone(){
        return new SnakePart(point);
    }

    public static enum State {
        HEAD, BODY;
    }
}