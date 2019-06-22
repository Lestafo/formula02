/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.manutencao;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    private TextField cidadeField;
    
    @FXML
    private void adicionar(){
        dao.ClienteDao.inserir(Telas.modelo.Pessoa.getCodAtual(), nomeField.getText(), enderecoField.getText(), Integer.parseInt(telefoneField.getText()), Integer.parseInt(cidadeField.getText()));
        System.out.println(Long.parseLong(telefoneField.getText()));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
