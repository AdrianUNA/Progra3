<<<<<<< HEAD:ProyectoProgra3/src/proyectoprogra3/ProyectoProgra3.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra3;

import javafx.application.Application;
import javafx.stage.Stage;
import proyectoprogra3.util.FlowController;

/**
 *
 * @author adria
 */
public class ProyectoProgra3 extends Application {
    
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
=======
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
>>>>>>> ee8827a146c64851e2f81c460320628682ec7e12:CineUNA/src/CineUNA/CineUNA.java
