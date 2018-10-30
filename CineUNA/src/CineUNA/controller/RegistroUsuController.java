/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CineUNA.controller;

import CineUNA.util.FlowController;
import CineUNA.util.properties.Idioma;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author adria
 */
public class RegistroUsuController extends Controller implements Initializable {

    @FXML
    private Label lbRegitroUsuarios;
    @FXML
    private JFXTextField tfNombre;
    @FXML
    private JFXTextField tfApellidos;
    @FXML
    private JFXTextField tfNombreUsuario;
    @FXML
    private JFXTextField tfCorreoElect;
    @FXML
    private ComboBox<String> cbLenguaje;
    @FXML
    private Label lbLenguaje;
    @FXML
    private JFXTextField tfContraseña;
    @FXML
    private Button btnRegistrarse;
    @FXML
    private Button btnCancelar;
    @FXML
    private ImageView imgCine;
    private Idioma idioma;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbLenguaje.getItems().addAll("Español", "Ingles");
        cbLenguaje.getSelectionModel().selectFirst();
        imgCine.setImage(new Image("/CineUNA/resources/cine.jpg"));
        
    }    

    @Override
    public void initialize() {
       
    }
    
    public void selecLenguaje()
    {
       
        if (cbLenguaje.getSelectionModel().getSelectedItem().equals("Español")
                || cbLenguaje.getSelectionModel().getSelectedItem().equals("Spanish")) {
            idioma = new Idioma("Español");
            cbLenguaje.getItems().clear();
            cbLenguaje.getItems().addAll(idioma.getProperty("chEspa"), idioma.getProperty("chIng"));
            cbLenguaje.getSelectionModel().selectFirst();

        } else {
            idioma = new Idioma("Ingles");
            cbLenguaje.getItems().clear();
            cbLenguaje.getItems().addAll(idioma.getProperty("chEspa"), idioma.getProperty("chIng"));
            cbLenguaje.getSelectionModel().selectLast();
        }

        lbRegitroUsuarios.setText(idioma.getProperty("lbRegitroUsuarios"));
        tfNombre.setPromptText(idioma.getProperty("tfNombre"));
        tfContraseña.setPromptText(idioma.getProperty("tfContrasenna"));
        tfApellidos.setPromptText(idioma.getProperty("tfApellidos"));
        tfCorreoElect.setPromptText(idioma.getProperty("tfCorreoElect"));
        tfNombreUsuario.setPromptText(idioma.getProperty("tfNombreUsuario"));
        btnRegistrarse.setText(idioma.getProperty("btnRegistrarse"));
        btnCancelar.setText(idioma.getProperty("btnCancelar"));
        lbLenguaje.setText(idioma.getProperty("lbLenguaje"));
        idioma = null;
    }
    @FXML
    private void selecLenguaje(Event event) {
          if (cbLenguaje.getSelectionModel() != null) {
            selecLenguaje();
        }
    }

    @FXML
    private void registrarse(ActionEvent event) {
    }

    @FXML
    private void cancelar(ActionEvent event) {
        FlowController.getInstance().salirPantallaSecundaria(btnCancelar.getScene().getWindow());
    }
    
}
