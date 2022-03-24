package services.CreateUser;

import models.User;
import repositories.IUserRepository;

public class CreateUserService {
    
    private IUserRepository userRepository;

    public CreateUserService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User Execute(String nome, int idade){
        User user = this.userRepository.Create(nome, idade);
        return user;
    }

}
