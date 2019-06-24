/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.manutencao;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lest
 */
public class PeçasController implements Initializable {

    @FXML
    private TextField fieldNome;
    @FXML
    private TextField fieldValor;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void adicionar(ActionEvent event) {
        dao.PecasDAO.inserir(Double.valueOf(fieldValor.getText()), fieldNome.getText());
    }
    
}
