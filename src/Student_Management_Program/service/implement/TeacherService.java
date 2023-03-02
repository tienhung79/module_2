package Student_Management_Program.service.implement;

import Student_Management_Program.model.Students;
import Student_Management_Program.model.Teachers;
import Student_Management_Program.repository.ITeacherRepository;
import Student_Management_Program.repository.implement.TeacherRespsitory;
import Student_Management_Program.service.ITeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    ITeacherRepository teacherRepository = new TeacherRespsitory();
    List<Teachers> list = teacherRepository.getAll();
    Scanner sc = new Scanner(System.in);

    @Override
    public void disPlay() {

        if (list.size() == 0) {
            System.out.println("Không có danh sách");
        } else {
            for (Teachers temp : list
            ) {
                System.out.println(temp);
            }
        }

    }

    @Override
    public void addTeacher() {
        System.out.println("Nhâp id của giảng viên:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên giảng viên:");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh của giảng viên:");
        String date = sc.nextLine();
        System.out.println("Nhập giới tính:");
        String gender = sc.nextLine();
        Boolean tempGender;
        if (gender.equals("Nam")){
            tempGender = true;
        }else if (gender.equals("Nữ")){
            tempGender= false;
        }else {
            tempGender=null;
        }
        System.out.println("Nhập trình độ:");
        String level = sc.nextLine();
        Teachers teachers = new Teachers(id,name,date,tempGender,level);
        teacherRepository.addTeacher(teachers);

    }

    @Override
    public void deleteTeacher() {
        System.out.println("Nhập id muốn xóa:");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (id==list.get(i).getId()){
                System.out.println("bạn có muốn xóa không?");
                System.out.println("1: có ");
                System.out.println("2: không ");
                int decide = Integer.parseInt(sc.nextLine());
                if (decide==1){
                    teacherRepository.delete(i);
                    System.out.println("Đã xóa thành công");
                }else if (decide==2){
                    System.out.println("khỏi xóa");
                }
            }else {
                System.out.println("Không tìm thấy");
            }
        }
    }
}
