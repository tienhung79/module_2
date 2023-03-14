package case_study.model;

import case_study.model.abstractClass.Person;

public class Employee extends Person {
    final String a = "Trung cấp";
    final String b= "Cao đẳng";
    final String c = "Đại học";
    final String d = "Sau đại học";
    private String level;
    private String options;
    private int salary;

    public Employee() {
    }

    public Employee(String level, String options, int salary) {
        this.level = level;
        this.options = options;
        this.salary = salary;
    }

    public Employee(int id, String name, String dateOfBirth, String gender, int idCMND, int numberOfPhone, String email, String level, String options, int salary) {
        super(id, name, dateOfBirth, gender, idCMND, numberOfPhone, email);
        this.level = level;
        this.options = options;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", options='" + options + '\'' +
                ", salary=" + salary +super.toString()+
                '}';
    }
    public String toWriteCSV(){
        return getLevel()+','+getOptions()+','+getSalary()+','+super.toWriteCSV();
    }
}
