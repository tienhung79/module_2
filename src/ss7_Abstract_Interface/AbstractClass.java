package ss7_Abstract_Interface;

public abstract class AbstractClass {
    private int a;
    private int b;

    public AbstractClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public AbstractClass(){};

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public abstract int sum();


}
