/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.manutencao;

import Telas.modelo.OrdemServico;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lest
 */
public class PagamentoController implements Initializable {

    @FXML
    private TextField ordemField;
    @FXML
    private TextField valorField;
    @FXML
    private TextField dataPagField;
    @FXML
    private TextField dataVencField;
    @FXML
    private ComboBox<OrdemServico> ordemBox;
    @FXML
    private Button btnAdicionar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ordemBox.getItems().addAll(dao.OrdemDAO.consultar());
    }    

    @FXML
    private void adicionar(ActionEvent event) {
        dao.PagamentoDAO.inserir(dataPagField.getText(), dataVencField.getText(), Double.valueOf(valorField.getText()), ordemBox.getValue().getCod());
    }
    
}
