package Model;

public class Student {
    private String name;
    private String dob;
    private String address;
    private String phone;
    private String email;
    private String classroom;

    public Student(String name, String dob, String address, String phone, String email, String classroom) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
