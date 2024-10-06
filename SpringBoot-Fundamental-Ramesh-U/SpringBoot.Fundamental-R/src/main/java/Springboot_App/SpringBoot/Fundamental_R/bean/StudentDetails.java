package Springboot_App.SpringBoot.Fundamental_R.bean;

public class StudentDetails {

    // creating the private variable of all the student class
    private String name ;
    private int RollNo ;
    private String FatherName ;
    private  String MotherName ;

    // creating the constructor of the method

    public StudentDetails(String name, int rollNo, String fatherName, String motherName) {
        this.name = name;
        RollNo = rollNo;
        FatherName = fatherName;
        MotherName = motherName;
    }

    // creating the getter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String motherName) {
        MotherName = motherName;
    }
}
