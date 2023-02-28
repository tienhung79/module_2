package Student_Management_Program.model;

public class Students extends People {
    private int classes;
    private int point;

    public Students() {

    }

    public Students(int id, String name, int date, String gender, int classes, int point) {
        super(id, name, date, gender);
        this.classes = classes;
        this.point = point;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

}
