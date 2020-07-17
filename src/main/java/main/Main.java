package main;


import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static StageCoach SB;
    static{
        try{
            SB = new StageCoach();
        }catch (Exception e){
            e.printStackTrace();
            /*
            @TODO
            Something if the initial stage or the stageBuilder itself does not initialize properly.
             */
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        SB.callLogin();
    }
}
