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
        System.out.print("Nhập id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên:");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh:");
        String date = sc.nextLine();
        System.out.print("Nhập giới tính:");
        String tempGender = sc.nextLine();
        Boolean gender;
        if (tempGender=="Nam" ){
            gender=true;
        }else if (tempGender=="Nữ")
        {
            gender =false;
        }else {
            gender =null;
        }
        System.out.print("Nhập lớp:");
        String classes = sc.nextLine();
        System.out.print("Nhập điểm:");
        int point = Integer.parseInt(sc.nextLine());
        Students student = new Students(id,name,date,gender,classes,point);
        iStudentRepository.addStudent(student);

    }

    @Override
    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        List<Students> list = iStudentRepository.getAll();
        System.out.println("Nhập id muốn xóa:");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (id==list.get(i).getId()){
                System.out.println("bạn có muốn xóa không?");
                System.out.println("1: có ");
                System.out.println("2: không ");
                int decide = Integer.parseInt(sc.nextLine());
                if (decide==1){
                    iStudentRepository.delete(i);
                    System.out.println("xóa thành công");
                }else if (decide==2){
                    System.out.println("khỏi xóa");
                }
                return;
            }
        }System.out.println("Không tìm thấy");
    }
}
