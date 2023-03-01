package Student_Management_Program.service.implement;

import Student_Management_Program.model.Students;
import Student_Management_Program.repository.IStudentRepository;
import Student_Management_Program.repository.implement.StudentRepository;
import Student_Management_Program.service.IStudentService;


import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void display() {
        List<Students> list = iStudentRepository.getAll();
        {
            if (list.size() == 0) {
                System.out.println("Không có danh sách");
            } else {
                for (Students temp : list
                ) {
                    System.out.println(temp);
                }
            }
        }
    }

    @Override
    public void creatStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên:");
        iStudentRepository.
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh:");
        String date = sc.nextLine();
        System.out.print("Nhập giới tính:");
        Boolean gender;
        if ( )
        System.out.print("Nhập lớp:");
        System.out.print("Nhập điểm:");

    }
}
