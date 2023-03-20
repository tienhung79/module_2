package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IRepositoryEmployee {

    List<Employee> getAll();

    void addNew(String path, List<Employee> employeeList);

    void edit(int i, Employee employee, List<Employee> employeeList, String path);

    void delete(int i);
}
