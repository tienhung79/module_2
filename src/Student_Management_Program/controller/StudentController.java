package Student_Management_Program.controller;

import Student_Management_Program.service.IStudentService;
import Student_Management_Program.service.implement.StudentService;

import java.util.Scanner;

public class StudentController {

    Scanner sc = new Scanner(System.in);

    public void menuStudent() {
        int choice;
        IStudentService iStudentService = new StudentService();
        do {
            System.out.println("--------------------------------------------");
            System.out.println("1: Thêm mới chức năng");
            System.out.println("2: Xóa giảng viên hoặc học sinh ");
            System.out.println("3: Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4: Thoát");
            System.out.print("Mời bạn nhập:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.creatStudent();
                    break;
                case 2:
                    iStudentService.deleteStudent();
                    break;
                case 3:
                    iStudentService.display();
                    break;
                case 4:
                    break;

            }
        } while (choice >= 1 && choice <= 4);


    }

}
