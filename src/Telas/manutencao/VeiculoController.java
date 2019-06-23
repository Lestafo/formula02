/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.manutencao;

import Telas.modelo.Pessoa;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lest
 */
public class VeiculoController implements Initializable {

    @FXML
    private TextField modeloField;
    @FXML
    private TextField tipoField;
    @FXML
    private TextField placaField;
    @FXML
    private ComboBox<Pessoa> clienteField;
    
    @FXML
    public void adicionar(){
        dao.VeiculoDAO.inserir(modeloField.getText(), tipoField.getText(), placaField.getText(), clienteField.getValue());
        System.out.println("ASASASAS");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clienteField.getItems().addAll(dao.ClienteDAO.consultar());
    }    
    
}
