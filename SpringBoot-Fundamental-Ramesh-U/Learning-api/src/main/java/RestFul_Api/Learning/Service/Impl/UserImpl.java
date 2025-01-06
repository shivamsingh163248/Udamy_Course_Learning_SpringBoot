package RestFul_Api.Learning.Service.Impl;

import RestFul_Api.Learning.Enity.User;
import RestFul_Api.Learning.Reposistory.Repository;
import RestFul_Api.Learning.Service.UserInterface;

public class UserImpl implements UserInterface {

    private Repository repository ;
    @Override
    public User CreateUser(User user) {

        // return the user save method to save the data
        return repository.save(user) ;
    }

    // now implement all the user interface
    //SHIVAM SINGH

}
