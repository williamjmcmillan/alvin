package controllers;


import animations.objects.Bird;
import animations.objects.Compass;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.Main;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class LoginController{




    public Compass compass;
    public GridPane gridPane;

    public LoginController(){

        System.out.println("LoginController");


    }


    private AnchorPane LAP;
    private Group lg;
    //LOGIN SCREEN
    private Parent loginpage;
    private Scene login;
    private Stage lgn = new Stage();

    //LOGIN

    public void callLogin(){
        System.out.println("Login screen called.");

        try{
            LAP = new AnchorPane();
            LAP.setMinWidth(700f);
            LAP.setMinHeight(500f);
            LAP.setStyle("-fx-background-color: #c2c27f");

            lgn.initStyle(StageStyle.UNDECORATED);
            lg = new Group();
            lg.getChildren().add(LAP);
            login = new Scene(lg);
            lgn.setScene(login);
            lgn.show();
        }catch(Exception e){
            System.out.println("commander" + e.getMessage());
        }finally {
            setCanvas();

        }

    }
    public void stopLgn(){
        lgn.close();
    }

    public Stage getLgn(){
        return lgn;
    }


    private void setCanvas(){

        gridPane = new GridPane();
        gridPane.setMinWidth(700);
        gridPane.setMinHeight(500);
        gridPane.setMaxHeight(500);
        gridPane.setMaxWidth(700);
        gridPane.setAlignment(Pos.CENTER);
        compass = new Compass();

        gridPane.add(compass.draw(), 0,0,1,1);

        LAP.getChildren().add(gridPane);



        LAP.getChildren().get(0).minWidth(700f);
        LAP.getChildren().get(0).minHeight(500f);

    }




}
