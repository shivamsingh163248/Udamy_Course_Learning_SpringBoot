package Springboot_App.SpringBoot.Fundamental_R.studentBean;



import java.util.ArrayList;
import java.util.List;

public class bankTransacton {

    // creating the class and check the bank transaction
    private int accountNumber ;
    private String name ;
    private String fatherName ;

    // creating the constructor of the class
    private int totalAmount ;

    public List<TranslationDetails>translationDetails ;

    public bankTransacton(int accountNumber, String name, String fatherName , int totalAmount ) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.totalAmount = totalAmount ;
        translationDetails = new ArrayList<>() ;
        Transaction() ;



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


    public static void addTotalAmount(int amount){

    }


    // creating the all the details
    public void Transaction(){

        TranslationDetails details = new TranslationDetails(344 ,60,45) ;
        TranslationDetails details1 = new TranslationDetails(345 ,50,405) ;
        TranslationDetails details2 = new TranslationDetails(346 ,80,485) ;
        TranslationDetails details3 = new TranslationDetails(347 ,7,4545) ;

        // now adding all the transaction done by detail
        translationDetails.add(details1) ;
        translationDetails.add(details) ;
        translationDetails.add(details2) ;
        translationDetails.add(details3) ;


    }





}
