package ss4_class_object.fan;

public class Fan {
    byte slow = 1, medium = 2, fast = 3;
    int speed = slow;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public byte getSlow() {
        return slow;
    }

    public void setSlow(byte slow) {
        this.slow = slow;
    }

    public byte getMedium() {
        return medium;
    }

    public void setMedium(byte medium) {
        this.medium = medium;
    }

    public byte getFast() {
        return fast;
    }

    public void setFast(byte fast) {
        this.fast = fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
                "medium=" + medium +
                ", fast=" + fast +
                ", speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
