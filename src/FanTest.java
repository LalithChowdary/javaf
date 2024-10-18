import java.util.Scanner;

class Fan{
    int SLOW=1,MEDIUM=2,FAST=3;
    int speed;
    boolean on;
    double radius;
    String color;
    Fan(){
        speed=SLOW;
        on=false;
        radius=5;
        color="blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean getOn(){
        return on;
    }


    public void tostring(){
        if(on){
            System.out.println("speed is "+speed+" radius : "+radius+" color : "+color);
        }
        else
            System.out.println("radius : "+radius+" color : "+color+" fan is off");
    }
}



public class FanTest {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        Fan fan2=new Fan();
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setSpeed(3);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.tostring();
        fan1.tostring();
    }
}
