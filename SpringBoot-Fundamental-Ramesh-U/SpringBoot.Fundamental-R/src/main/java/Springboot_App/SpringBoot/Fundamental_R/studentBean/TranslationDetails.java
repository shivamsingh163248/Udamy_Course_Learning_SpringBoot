package Springboot_App.SpringBoot.Fundamental_R.studentBean;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class TranslationDetails {

    // creating the TranslationDetails
    private int amount;
    private LocalDateTime date ;
    private  int debitAmount ;
    private int CreditAmount;


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }



    public int getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(int debitAmount) {
        this.debitAmount = debitAmount;
    }

    public int getCreditAmount() {
        return CreditAmount;
    }

    public void setCreditAmount(int creditAmount) {
        CreditAmount = creditAmount;
    }




    public TranslationDetails(int amount, int debitAmount, int creditAmount) {
        this.amount = amount;
        date = LocalDateTime.now() ;
        this.debitAmount = debitAmount;
        CreditAmount = creditAmount;
    }

}
