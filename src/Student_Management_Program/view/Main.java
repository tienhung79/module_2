package Student_Management_Program.view;

import Student_Management_Program.controller.StudentController;
import Student_Management_Program.controller.TeacherController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int click;
        do {
            System.out.println("Mời bạn chọn giáo viên hoặc học sinh");
            System.out.println("1:Học Sinh");
            System.out.println("2:Giáo viên");
            click = Integer.parseInt(sc.nextLine());
        }while (click<1 || click >2 );

        if (click==1) {
            new StudentController().menuStudent();
        }else if (click==2){
            new TeacherController().menuTeacher();
        }
    }
}
