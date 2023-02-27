package ss7_Abstract_Interface;

public class Main {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.setA(5);
        sum.setB(6);
        System.out.println(sum.sum());
    }
}
