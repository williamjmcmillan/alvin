package main;

import controllers.LoginController;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;

public class StageCoach {


    private static LoginController loginController;

public StageCoach(){
    System.out.println("STAGECOACH INITIALIZED");
}



public static void callLogin(){
    loginController = new LoginController();
    loginController.callLogin();
}

}
