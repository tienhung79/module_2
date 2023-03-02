package Student_Management_Program.model;

public class Teachers extends People{
    private String level;

    public Teachers() {
    }

    public Teachers(int id, String name, String date, Boolean gender, String level) {
        super(id, name, date, gender);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "level='" + level + '\'' + super.toString()+
                '}';
    }
}
