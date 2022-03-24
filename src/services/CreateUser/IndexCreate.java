package services.CreateUser;

import repositories.implementations.UserRepository;

public class IndexCreate {

    public CreateUserService createUserService;

    public IndexCreate() {
        CreateUserService createUserService = new CreateUserService(UserRepository.GetInstance());
        this.createUserService = createUserService;
    }

}
