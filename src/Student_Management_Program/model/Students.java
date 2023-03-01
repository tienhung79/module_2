package Student_Management_Program.model;

public class Students extends People {
    private String classes;
    private int point;

    public Students() {

    }

    public Students(int id, String name, String date, Boolean gender, String classes, int point) {
        super(id, name, date, gender);
        this.classes = classes;
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Students{" +
                "classes=" + classes +
                ", point=" + point + super.toString()+
                '}';
    }
}
