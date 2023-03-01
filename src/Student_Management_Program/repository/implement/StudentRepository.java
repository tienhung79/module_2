package Student_Management_Program.repository.implement;

import Student_Management_Program.model.Students;
import Student_Management_Program.repository.IStudentRepository;
import Student_Management_Program.service.implement.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Students> studenstList = new ArrayList<>();
 static {
     studenstList.add(new Students(123,"Hưng","07/09/2000",true,"c1222g1",8));
     studenstList.add(new Students(123,"Hoàng","07/09/2000",true,"c1222g1",8));
     studenstList.add(new Students(123,"Huy","07/09/2000",true,"c1222g1",8));
     studenstList.add()
 }
    @Override
    public List<Students> getAll() {
            return studenstList;
    }


}
