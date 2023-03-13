package case_study.model.abstractClass;

public class Person {

    private int id;
    private String name;
    private String dateOfBirth;
    private Boolean gender;
    private int idCMND;
    private int numberOfPhone;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, Boolean gender, int idCMND, int numberOfPhone, String email) {
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public int getIdCMND() {
        return idCMND;
    }

    public void setIdCMND(int idCMND) {
        this.idCMND = idCMND;
    }

    public int getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(int numberOfPhone) {
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
                ", email='" + email + '\'' ;
    }
//    int id, String name, String dateOfBirth, Boolean gender, int idCMND, int numberOfPhone, String email
    public String toWriteCSV(){
        return id+name+dateOfBirth+gender+idCMND+numberOfPhone+email;
    }
}
