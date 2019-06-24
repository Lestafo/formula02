/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.manutencao;

import Telas.modelo.OrdemServico;
import Telas.modelo.Ordem_Pecas;
import Telas.modelo.Pecas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lest
 */
public class Ordem_de_PeçasController implements Initializable {

    @FXML
    private TextField valorField;
    @FXML
    private TextField quantPecField;
    @FXML
    private ComboBox<OrdemServico> ordemField;
    @FXML
    private ComboBox<Pecas> pecasField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ordemField.getItems().addAll(dao.OrdemDAO.consultar());
        pecasField.getItems().addAll(dao.PecasDAO.consultar());
    }    

    @FXML
    private void adicionar(ActionEvent event) {
        dao.OrdemPecasDAO.inserir(ordemField.getValue().getCod(), pecasField.getValue().getCod(), Integer.valueOf(quantPecField.getText()), Double.valueOf(valorField.getText()));
    }
    
}
