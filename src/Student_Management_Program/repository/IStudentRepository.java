package Student_Management_Program.repository;

import Student_Management_Program.model.Students;

import java.util.List;

public interface IStudentRepository {
        List<Students> getAll();

        void addStudent(Students student);
}
