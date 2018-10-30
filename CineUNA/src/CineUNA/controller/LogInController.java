/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CineUNA.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import CineUNA.util.Animacion;
import CineUNA.util.FlowController;
import CineUNA.util.properties.Idioma;

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
    private JFXButton btnSalir;

    /**
     * Initializes the controller class.
     */
    private Idioma idioma;
    @FXML
    private ImageView imgContra;
    @FXML
    private JFXPasswordField tfContraseña;
    @FXML
    private ComboBox<String> cbIdioma;
    @FXML
    private Label lbLenguaje;

    public static String lenguaje = "Español";
    @FXML
    private JFXButton btnRecuperarC;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cbIdioma.getItems().addAll("Español", "Ingles");
        cbIdioma.getSelectionModel().selectFirst();
        Animacion.getInstance().animarTexto(lbTitulo);
        imgUser.setImage(new Image("/CineUNA/resources/user.png"));
        imgContra.setImage(new Image("/CineUNA/resources/lock.png"));
    }

    @Override
    public void initialize() { System.out.println("staic" + lenguaje);
        if(lenguaje.equals("Español")||lenguaje.equals("Spanish"))
        {
        cbIdioma.getSelectionModel().selectFirst();
        escogerIdi();
        }
        else
        {
        cbIdioma.getSelectionModel().selectLast();
        escogerIdi();
        }
    }

    public void escogerIdi() {
        if (cbIdioma.getSelectionModel().getSelectedItem().equals("Español")
                || cbIdioma.getSelectionModel().getSelectedItem().equals("Spanish")) {
            idioma = new Idioma("Español");
            lenguaje = "Español";
            cbIdioma.getItems().clear();
            cbIdioma.getItems().addAll(idioma.getProperty("chEspa"), idioma.getProperty("chIng"));
            cbIdioma.getSelectionModel().selectFirst();

        } else {
            idioma = new Idioma("Ingles");
            lenguaje = "Ingles";
            cbIdioma.getItems().clear();
            cbIdioma.getItems().addAll(idioma.getProperty("chEspa"), idioma.getProperty("chIng"));
            cbIdioma.getSelectionModel().selectLast();
        }

        lbTitulo.setText(idioma.getProperty("titulo"));
        tfUsuario.setPromptText(idioma.getProperty("tfUsuario"));
        tfContraseña.setPromptText(idioma.getProperty("tfContrasenna"));
        btnIngresar.setText(idioma.getProperty("btnIngresar"));
        btnRegistrarse.setText(idioma.getProperty("btnRegistrarse"));
        btnSalir.setText(idioma.getProperty("btnSalir"));
        lbLenguaje.setText(idioma.getProperty("lbLenguaje"));
        btnRecuperarC.setText(idioma.getProperty("btnRecuperarC"));
        idioma = null;
    }

    @FXML
    private void ingresar(ActionEvent event) {
    }

    @FXML
    private void registrarse(ActionEvent event) {
        FlowController.getInstance().goViewInWindow("RegistroUsu");
    }

    @FXML
    private void salir(ActionEvent event) {
        FlowController.getInstance().salir();
    }

    @FXML
    private void seleccionarIdioma(Event event) {
        if (cbIdioma.getSelectionModel() != null) {
            escogerIdi();
        }

    }

    @FXML
    private void recuperarC(ActionEvent event) {
        FlowController.getInstance().goViewInWindow("RecuperarContrasenna");
        btnIngresar.getScene().getWindow().hide();
    }

}
