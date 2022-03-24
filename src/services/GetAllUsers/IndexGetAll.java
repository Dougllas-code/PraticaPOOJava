package services.GetAllUsers;

import repositories.implementations.UserRepository;

public class IndexGetAll {

    public GetAllUserService getAllUserService;

    public IndexGetAll(){
        GetAllUserService getAllUserService = new GetAllUserService(UserRepository.GetInstance());
        this.getAllUserService = getAllUserService;
    }

}
