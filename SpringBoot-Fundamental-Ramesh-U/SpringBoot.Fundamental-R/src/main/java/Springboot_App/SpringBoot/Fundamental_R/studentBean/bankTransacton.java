package Springboot_App.SpringBoot.Fundamental_R.studentBean;

public class bankTransacton {

    // creating the class and check the bank transaction
    private int accountNumber ;
    private String name ;
    private String fatherName ;

    // creating the constructor of the class
    private static int totalAmount ;


    public bankTransacton(int accountNumber, String name, String fatherName) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.fatherName = fatherName;
    }
}
