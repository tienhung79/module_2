package Student_Management_Program.repository.implement;

import Student_Management_Program.model.Students;
import Student_Management_Program.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Students> studenstList = new ArrayList<>();
 static {
     studenstList.add(new Students(456,"Hưng","07/09/2000",true,"c1222g1",8));
     studenstList.add(new Students(455,"Hoàng","07/09/2000",true,"c1222g1",8));
     studenstList.add(new Students(113,"Huy","07/09/2000",true,"c1222g1",8));
 }
    @Override
    public List<Students> getAll() {
            return studenstList;
    }

    @Override
    public void addStudent(Students student) {
        studenstList.add(student);
    }

    @Override
    public void delete(int i) {
        studenstList.remove(i);
    }


}
