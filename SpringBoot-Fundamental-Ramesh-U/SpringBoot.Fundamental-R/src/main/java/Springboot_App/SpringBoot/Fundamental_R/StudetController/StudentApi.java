package Springboot_App.SpringBoot.Fundamental_R.StudetController;



import Springboot_App.SpringBoot.Fundamental_R.studentBean.AllAccount;
import Springboot_App.SpringBoot.Fundamental_R.studentBean.TranslationDetails;
import Springboot_App.SpringBoot.Fundamental_R.studentBean.bankTransacton;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public  class StudentApi {

    // creating the api according two the values
//    @GetMapping("/aaccount/{ac}")
//    public bankTransacton accountDetails(@PathVariable("ac") int accountNumber){
//
//        // creating the find the particular object
//
//        // return the according to account number in the list of the account
//        AllAccount account = new AllAccount() ;
//        account.AllAccountList.forEach((object) -> {
//            if(object.getAccountNumber() == accountNumber){
//                // return the  object if account number found
//
//            }
//        });
//    }


    // creating the api for the return the all the account details
    @GetMapping("/allAccount")
    public ArrayList<bankTransacton> allAccount(){
        AllAccount account = new AllAccount() ;
        return account.getAllAccountList() ;
    }

    // creating the api for the return the all the account details
    @GetMapping("/allAccount/{ac}")
    public bankTransacton allAccount(@PathVariable("ac") int accountNumber){
        AllAccount account = new AllAccount() ;
        for(bankTransacton object : account.AllAccountList){
            if(object.getAccountNumber() == accountNumber){
                return object ;
            }
        }
        return null ;
    }

    // creating the api to return transaction details of the account number
    @GetMapping("/allAccount/{ac}/transaction")
    public ArrayList<TranslationDetails> allAccountTransaction(@PathVariable("ac") int accountNumber){
        AllAccount account = new AllAccount() ;
        for(bankTransacton object : account.AllAccountList){
            if(object.getAccountNumber() == accountNumber){
                return (ArrayList<TranslationDetails>) object.translationDetails;
            }
        }
        return null ;
    }

}
