package rikkei.academy.view;

import rikkei.academy.config.Config;
import rikkei.academy.controller.UserController;
import rikkei.academy.model.User;
import rikkei.academy.service.role.RoleServiceIMPL;

public class Main {
    public Main(){
        UserController userController = new UserController();
        User user = userController.getCurrentUser();
        new RoleServiceIMPL().findAll();
        System.out.println(new RoleServiceIMPL().findAll());
        if (user==null){
            System.out.println("1.Register");
            System.out.println("2.Login");
        }
        else {
            System.out.println("3.Show List User");
            System.out.println("4.My profile");
            System.out.println("5.create category");
            System.out.println("6.show list category");
        }



        int chooseMenu = Config.scanner().nextInt();
        switch (chooseMenu){
            case 1:
                new ViewUser().formRegister();
                break;
            case 2:
                new ViewUser().fromLogin();
                break;
            case 3:
                new ViewUser().showListUser();
                break;
            case 4:
                new ViewUser().profile();
                break;
            case 5:
                new ViewCategory().formCreateCategory();
                break;
            case 6:
                new ViewCategory().formShowListCategory();
                break;

        }
    }
    public static void main(String[] args) {

        new Main();
    }
}