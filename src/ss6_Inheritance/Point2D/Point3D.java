package ss6_Inheritance.Point2D;

import java.security.PublicKey;
import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D(){

    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float z,float x, float y){
        this.setX(x);
        this.setY(y);
        this.z=z;
    }
    public String getXYZ(){
        float[] array = {getX(),getY(),getZ()};
        return Arrays.toString(array);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
