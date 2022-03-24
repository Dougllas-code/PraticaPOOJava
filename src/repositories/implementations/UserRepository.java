package repositories.implementations;

import java.util.ArrayList;

import models.User;
import repositories.IUserRepository;

public class UserRepository implements IUserRepository {

    private ArrayList<User> users;

    private static UserRepository INSTANCE;

    private UserRepository() {
        this.users = new ArrayList<User>();
    }

    public static UserRepository GetInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserRepository();
        }
        return INSTANCE;
    }

    @Override
    public User Create(String name, int idade) {
        User user = new User(name, idade);
        users.add(user);
        return user;
    }

    @Override
    public ArrayList<User> GetAll() {
        return users;
    }

    @Override
    public User FindByName(String name) {
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).name.equals(name)){
                return users.get(i);
            }
        }
        return null;
    }

}
