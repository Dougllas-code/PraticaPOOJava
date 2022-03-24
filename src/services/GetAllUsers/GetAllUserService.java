package services.GetAllUsers;

import java.util.ArrayList;

import models.User;
import repositories.IUserRepository;

public class GetAllUserService {

    private IUserRepository userRepository;

    public GetAllUserService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public ArrayList<User> Execute(){
        ArrayList<User> users = this.userRepository.GetAll();
        return users;
    }

}
