package Student_Management_Program;

public abstract class People {
    private int code;
    private String name;
    private int date;
    private String gender;
    public People(){

    }

    public People(int code, String name, int date, String gender) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.gender = gender;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
