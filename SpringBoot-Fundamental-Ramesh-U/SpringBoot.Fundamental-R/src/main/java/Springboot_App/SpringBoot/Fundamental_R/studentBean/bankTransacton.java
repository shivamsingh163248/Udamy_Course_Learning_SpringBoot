package Springboot_App.SpringBoot.Fundamental_R.studentBean;

import java.util.List;

public class bankTransacton {

    // creating the class and check the bank transaction
    private int accountNumber ;
    private String name ;
    private String fatherName ;

    // creating the constructor of the class


    private List<TranslationDetails>translationDetails ;

    public bankTransacton(int accountNumber, String name, String fatherName) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.fatherName = fatherName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }


}
