/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CineUNA.controller;

import static CineUNA.controller.LogInController.lenguaje;
import CineUNA.util.FlowController;
import CineUNA.util.properties.Idioma;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author adria
 */
public class RecuperarContrasennaController extends Controller implements Initializable {

    @FXML
    private JFXTextField tfCorreo;
    @FXML
    private JFXButton btnCambio;
    @FXML
    private JFXButton btnCancelar;
    private Idioma idioma;
    @FXML
    private Label lbSolicitarCambio;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void cambio(ActionEvent event) {
    }

    @FXML
    private void cancelar(ActionEvent event) {
        
        FlowController.getInstance().goMain();
        FlowController.getInstance().salirPantallaSecundaria(btnCambio.getScene().getWindow());
    }

    @Override
    public void initialize() {
          if(lenguaje.equals("Español")||lenguaje.equals("Spanish"))
        {
            idioma = new Idioma(lenguaje);
        }
        else 
        {
            idioma = new Idioma(lenguaje);
        }
        btnCancelar.setText(idioma.getProperty("btnCancelar"));
        tfCorreo.setPromptText(idioma.getProperty("tfCorreoElect"));
        btnCambio.setText(idioma.getProperty("btnCambioContraseña"));
        lbSolicitarCambio.setText(idioma.getProperty("lbSolicitarCambio"));
    }
    
}
