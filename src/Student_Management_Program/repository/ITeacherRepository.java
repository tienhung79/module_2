package Student_Management_Program.repository;

import Student_Management_Program.model.Teachers;

import java.util.List;

public interface ITeacherRepository {
    List<Teachers> getAll();

    void addTeacher(Teachers teachers);

    void delete(int i);
}
