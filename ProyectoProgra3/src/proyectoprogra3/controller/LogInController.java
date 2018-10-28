/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra3.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import proyectoprogra3.util.Animacion;
import proyectoprogra3.util.FlowController;
import proyectoprogra3.util.Idioma;

/**
 * FXML Controller class
 *
 * @author adria
 */
public class LogInController extends Controller implements Initializable {

    @FXML
    private JFXButton btnIngresar;
    @FXML
    private JFXButton btnRegistrarse;
    @FXML
    private JFXTextField tfUsuario;
    @FXML
    private ImageView imgUser;
    @FXML
    private Label lbTitulo;
    @FXML
    private ChoiceBox<String> chIdioma;
    @FXML
    private JFXButton btnSalir;

    /**
     * Initializes the controller class.
     */
    Idioma idioma;
    @FXML
    private JFXButton btnOk;
    @FXML
    private ImageView imgContra;
    @FXML
    private JFXPasswordField tfContraseña;
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        chIdioma.getItems().addAll("Español", "Ingles");
        chIdioma.getSelectionModel().selectFirst();
        Animacion.getInstance().animarTexto(lbTitulo);
        imgUser.setImage(new Image("/proyectoprogra3/resources/user.png"));
        imgContra.setImage(new Image("/proyectoprogra3/resources/lock.png"));
        System.out.println("hola mundo");
    }

    @Override
    public void initialize() {

    }

    public void escogerIdi() {
        if (chIdioma.getSelectionModel().getSelectedItem().equals("Español")||
            chIdioma.getSelectionModel().getSelectedItem().equals("Spanish")) 
        {
            idioma = new Idioma("Español");
            chIdioma.getItems().clear();
            lbTitulo.setText(idioma.getProperty("titulo"));
            chIdioma.getItems().addAll(idioma.getProperty("chEspa"),idioma.getProperty("chIng"));
            tfUsuario.setPromptText(idioma.getProperty("tfUsuario"));
            tfContraseña.setPromptText(idioma.getProperty("tfContrasenna"));
            btnIngresar.setText(idioma.getProperty("btnIngresar"));
            btnRegistrarse.setText(idioma.getProperty("btnRegistrarse"));
            btnSalir.setText(idioma.getProperty("btnSalir"));
            chIdioma.getSelectionModel().selectFirst();
            
            idioma=null;
        } 
        else 
        {
            idioma = new Idioma("Ingles");
            chIdioma.getItems().clear();
            chIdioma.getItems().addAll(idioma.getProperty("chEspa"),idioma.getProperty("chIng"));
            lbTitulo.setText(idioma.getProperty("titulo"));
            tfUsuario.setPromptText(idioma.getProperty("tfUsuario"));
            tfContraseña.setPromptText(idioma.getProperty("tfContrasenna"));
            btnIngresar.setText(idioma.getProperty("btnIngresar"));
            btnRegistrarse.setText(idioma.getProperty("btnRegistrarse"));
            btnSalir.setText(idioma.getProperty("btnSalir"));
            chIdioma.getSelectionModel().selectLast();
            
            idioma=null;
        }
    }

    @FXML
    private void ingresar(ActionEvent event) {
    }

    @FXML
    private void registrarse(ActionEvent event) {
    }

    @FXML
    private void ok(ActionEvent event) {
        escogerIdi();
    }

    @FXML
    private void salir(ActionEvent event) {
        FlowController.getInstance().salir();
    }

}
