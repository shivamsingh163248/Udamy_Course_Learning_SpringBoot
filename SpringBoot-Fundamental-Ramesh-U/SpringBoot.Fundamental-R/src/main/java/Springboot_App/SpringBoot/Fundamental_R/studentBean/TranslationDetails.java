package Springboot_App.SpringBoot.Fundamental_R.studentBean;

public class TranslationDetails {

    // creating the TranslationDetails
    private int amount;
    private int date  ;
    private  int debitAmount ;
    private int CreditAmount;


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
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




    public TranslationDetails(int amount, int date, int debitAmount, int creditAmount) {
        this.amount = amount;
        this.date = date;
        this.debitAmount = debitAmount;
        CreditAmount = creditAmount;
    }

}
