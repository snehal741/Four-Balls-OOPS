import processing.core.PApplet;
public class Ball extends PApplet{
    int xCord, yCord, diameter, speed;

    Ball(int speed,  int yCord){
        this.xCord = 0;
        this.yCord = yCord;
        this.diameter = 5;
        this.speed = speed;
    }

    void show(PApplet pApplet){
        pApplet.ellipse(xCord, yCord, diameter, diameter);
    }

    void move(){
        xCord = xCord + speed;
    }


}
