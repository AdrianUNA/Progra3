/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CineUNA.util;

import static javafx.animation.Animation.INDEFINITE;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 *
 * @author adria
 */
public class Animacion {
     private static final Animacion SINGLETONE = new Animacion();
    
    //Constructor básico
    private Animacion(){
        //Carga los datos básicos
    }
    
    //Getter de la instancia, es la única forma de acceso al SINGLETONE
    public static Animacion getInstance(){
        return SINGLETONE;
    }
     
    public void animarTexto(Node texto)
    {
        ScaleTransition St = new ScaleTransition(Duration.millis(1500),texto);
        St.setFromX(1.0);
        St.setFromY(1.0);
        
        St.setToX(0.8);
        St.setToY(0.8);
        
        St.setAutoReverse(true);
        St.setCycleCount(INDEFINITE);
       
        St.play();
    }
    
    public void animarImagen(Node imagen)
    {
        FadeTransition Ft = new FadeTransition(Duration.millis(1500), imagen);
        
        Ft.setFromValue(0.0);
        Ft.setToValue(1.0);
        
        Ft.play();
       
    }
    public void animar(Node imagen)
    {
        RotateTransition Rt = new RotateTransition(Duration.millis(19000), imagen);
            Rt.setFromAngle(0);
            Rt.setToAngle(359.99);
            Rt.setCycleCount(INDEFINITE);
           Rt.play();
    }
}
