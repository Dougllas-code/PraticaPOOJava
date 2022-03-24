package services.GetUserByName;

import models.User;
import repositories.IUserRepository;

public class GetUserByNameService {
    
    private IUserRepository userRepository;

    public GetUserByNameService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User Execute(String name){
        User user = this.userRepository.FindByName(name);
        return user;
    }

}
