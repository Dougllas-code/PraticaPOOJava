package services.GetUserByName;

import repositories.implementations.UserRepository;

public class IndexGetUserByName {
    
    public GetUserByNameService getUserByNameService;

    public IndexGetUserByName(){
        GetUserByNameService getUserByNameService = new GetUserByNameService(UserRepository.GetInstance());
        this.getUserByNameService = getUserByNameService;
    }

}
