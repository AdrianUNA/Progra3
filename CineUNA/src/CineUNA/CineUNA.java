/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CineUNA;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import CineUNA.util.FlowController;

/**
 *
 * @author adria
 */
public class CineUNA extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("Inicio.fxml"));
        // stage.getIcons().add(new Image("/tarea/resources/icon1.png"));
       // stage.setResizable(false);
       // stage.initStyle(StageStyle.TRANSPARENT);
        
        FlowController.getInstance().InitializeFlow(stage,null);
        
        FlowController.getInstance().goMain();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
