package repositories;

import java.util.ArrayList;

import models.User;

public interface IUserRepository {
    public User Create(String name, int idade);

    public ArrayList<User> GetAll();

    public User FindByName(String name);
}
