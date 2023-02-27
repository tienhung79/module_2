package ss7_Abstract_Interface;

public class Sum extends AbstractClass {
  int c;
    public Sum(){
    };
    public Sum(int a, int b,int c) {
        super(a, b);
        this.c =c;
    }
    @Override
    public int sum() {
       return this.c = getA()+getB();
}
}
