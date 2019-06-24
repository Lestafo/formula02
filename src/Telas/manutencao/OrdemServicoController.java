/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.manutencao;

import Telas.modelo.Veiculo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lest
 */
public class OrdemServicoController implements Initializable {

    @FXML
    private Button btnAdicionar;
    @FXML
    private Button btnAlterar;
    @FXML
    private TextField valorField;
    @FXML
    private TextField dataField;
    @FXML
    private TextField progressoField;
    @FXML
    private TextField situacaoField;
    @FXML
    private TextField observacaoField;
    @FXML
    private CheckBox pagoField;
    @FXML
    private ComboBox<Veiculo> veiculoBox;
    
    @FXML
    public void adicionar(){
        dao.OrdemDAO.inserir(pagoField.isSelected(), Double.parseDouble(valorField.getText()), progressoField.getText(), dataField.getText(), situacaoField.getText(), observacaoField.getText(),veiculoBox.getValue() );
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        veiculoBox.getItems().addAll(dao.VeiculoDAO.consultar());
    }    
    
}
