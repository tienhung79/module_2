package ss4_class_object.quadracticequation;

import java.util.Scanner;

public class QuadracticEquationMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a= sc.nextDouble();
        System.out.println("Nhập số b:");
        double b= sc.nextDouble();
        System.out.println("Nhập số c:");
        double c= sc.nextDouble();
        QuadracticEquation quadracticEquation = new QuadracticEquation(a,b,c);
        System.out.println("Delta là:" +quadracticEquation.getDiscriminant());
        if (quadracticEquation.getDiscriminant()>0){
            System.out.println("Nghiệm 1 là :"+quadracticEquation.getRoot1());
            System.out.println("Nghiệm 2 là :"+quadracticEquation.getRoot2());
        } else if (quadracticEquation.getDiscriminant()==0) {
            System.out.println("Nghiệm của phương trình là: "+quadracticEquation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
