package Springboot_App.SpringBoot.Fundamental_R.studentBean;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

import java.util.ArrayList;

public class AllAccount {


    // creating the account manually and the test
    public ArrayList<bankTransacton>AllAccountList ;
    bankTransacton f1= new bankTransacton(34343433,"shivam singh " , "satyendra kumar singh " , 400) ;
    bankTransacton f2= new bankTransacton(34343434,"Itisha singh  " , "satyendra kumar singh " , 400) ;
    bankTransacton f3= new bankTransacton(34343435,"lovely singh  " , "satyendra kumar singh " , 400) ;
    bankTransacton f4= new bankTransacton(34343436,"anuj singh" , "satyendra kumar singh " , 400) ;
     // now adding all the details

    // CREATING method add all
    public AllAccount(){
        AllAccountList = new ArrayList<>() ;

        AllAccountList.add(f1) ;
        AllAccountList.add(f2) ;
        AllAccountList.add(f3) ;
        AllAccountList.add(f4) ;


    }


    public ArrayList<bankTransacton> getAllAccountList() {
        return AllAccountList;
    }
}
