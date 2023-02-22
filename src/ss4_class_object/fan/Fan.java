package ss4_class_object.fan;

public class Fan {
    final byte Slow = 1;
    final byte medium = 2;
    final byte fast = 3;

    int speed = Slow;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public byte getSlow() {
        return Slow;
    }

    public byte getMedium() {
        return medium;
    }

    public byte getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (getOn()) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }



    public void setOn(boolean on) {
        this.on = on;
    }
    public boolean getOn(){
        return this.on;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                ", speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
