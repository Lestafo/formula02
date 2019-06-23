/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.manutencao;

import Telas.modelo.Cidade;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
public class PaisManutencaoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button botaoOk;
    
    @FXML
    private TextField nomeField;
    
    @FXML
    private TextField enderecoField;
    
    @FXML
    private TextField telefoneField;
    
    @FXML
    private ComboBox<Cidade> cidadeField;
    
    @FXML
    private void adicionar(){
        System.out.println(cidadeField.getValue().getCod());
        dao.ClienteDao.inserir(nomeField.getText(), enderecoField.getText(),(cidadeField.getValue().getCod()), Integer.parseInt(telefoneField.getText()));
        //System.out.println(Long.parseLong(telefoneField.getText()));
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cidadeField.getItems().addAll(dao.CidadeDAO.consultar());
        
    }    
    
}
