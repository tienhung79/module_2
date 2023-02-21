package ss4_class_object.Rectangle;

public class Rectangle {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return this.width*this.height;
    }
    public int getPerimeter(){
        return (this.width+this.height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
