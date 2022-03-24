import java.util.ArrayList;
import java.util.Scanner;

import models.User;
import services.CreateUser.IndexCreate;
import services.GetAllUsers.IndexGetAll;
import services.GetUserByName.IndexGetUserByName;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        IndexCreate createUser = new IndexCreate();
        IndexGetAll getAllUsers = new IndexGetAll();
        IndexGetUserByName getUserByName = new IndexGetUserByName();

        boolean parada = false;

        while (!parada) {

            System.out.println("\nSelecione uma opção");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar todos os usuário");
            System.out.println("3 - Buscar usuário por nome");
            System.out.println("4 - Sair do programa");

            int option = scanner.nextInt();

            switch (option) {
                case 1:

                    System.out.println("\nInforme o nome do usuário");
                    String nomeUsuario = scanner.next();

                    System.out.println("Informe a idade do usuário");
                    int idadeUsuario = scanner.nextInt();

                    createUser.createUserService.Execute(nomeUsuario, idadeUsuario);
                    System.out.println("\nUsuário cadastrado com sucesso");
                    break;

                case 2:

                    ArrayList<User> users = getAllUsers.getAllUserService.Execute();

                    for (int i = 0; i < users.size(); i++) {
                        System.out.println("\nUsuário " + (i + 1));
                        System.out.println("Nome: " + users.get(i).name);
                        System.out.println("Idade: " + users.get(i).idade);
                    }
                    break;

                case 3:

                    System.out.println("Informe o nome do usuário");
                    String nome = scanner.next();

                    User user = getUserByName.getUserByNameService.Execute(nome);

                    System.out.println(user);
                    System.out.println("\nNome: " + user.name);
                    System.out.println("Idade: " + user.idade);

                    break;

                case 4:
                    parada = true;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }

    }
}
