package case_study.model.abstractClass;

public class Person {

    private int id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private int idCMND;
    private String numberOfPhone;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, String gender, int idCMND, String numberOfPhone, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCMND = idCMND;
        this.numberOfPhone = numberOfPhone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCMND() {
        return idCMND;
    }

    public void setIdCMND(int idCMND) {
        this.idCMND = idCMND;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", dateOfBirth='" + dateOfBirth + '\'' +
                        ", gender=" + gender +
                        ", idCMND=" + idCMND +
                        ", numberOfPhone=" + numberOfPhone +
                        ", email='" + email + '\'';
    }

    //    int id, String name, String dateOfBirth, Boolean gender, int idCMND, int numberOfPhone, String email
    public String toWriteCSV() {
        return getId() + "," + getName() + "," + getDateOfBirth() + "," + getGender() + "," + getIdCMND() + "," + getNumberOfPhone() + "," + getEmail();

    }

}
