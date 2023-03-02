package Student_Management_Program.controller;

import Student_Management_Program.repository.ITeacherRepository;
import Student_Management_Program.service.ITeacherService;
import Student_Management_Program.service.implement.TeacherService;

import java.util.Scanner;

public class TeacherController {
    ITeacherService teacherService = new TeacherService();

    Scanner sc = new Scanner(System.in);
    public void menuTeacher(){
        String choice;
            do {
                System.out.println("--------------------------------------------");
                System.out.println("1: Thêm mới chức năng");
                System.out.println("2: Xóa giảng viên ");
                System.out.println("3: Xem danh sách giảng viên ");
                System.out.println("4: Thoát");
                System.out.print("Mời bạn nhập:");
                choice = sc.nextLine();
                switch (choice){
                    case "1":
                        teacherService.addTeacher();
                        break;
                    case "2":
                        teacherService.deleteTeacher();
                        break;
                    case "3":
                           teacherService.disPlay();
                           break;
                    case "4":
                        System.out.println("đã dừng chương trình");
                }
            }while (!choice.equals("4"));
    }
}
