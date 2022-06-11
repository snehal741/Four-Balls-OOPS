import processing.core.PApplet;
import java.util.ArrayList;

public class FourBalls extends PApplet{
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static ArrayList<Ball> balls = new ArrayList<>();
    public static void main(String[] args) {
        PApplet.main("FourBalls", args);

    }

    @Override
    public void setup() {
        for(int i=1 ; i<=4 ; i++){
            balls.add(new Ball(i, i*HEIGHT/5));
        }
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (Ball ball : balls){
            ball.show(this);
            ball.move();
        }
    }
}