package models;

public class User {

    public String name;
    public int idade;

    public User(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
