package Student_Management_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[100];
        Students students = new Students();
        for (int i = 0; i < array.length; i++) {
            students.setCode(Integer.parseInt(sc.nextLine()));
            array[i]=students.getCode();
            students.setName(sc.nextLine());
            students.setDate(Integer.parseInt(sc.nextLine()));
        }

    }
}
