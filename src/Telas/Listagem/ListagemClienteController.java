/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Listagem;

import Telas.modelo.Pessoa;
import dao.ClienteDAO;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Lest
 */
public class ListagemClienteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TableView<Telas.modelo.Pessoa> Tabela;
    @FXML
    private TableColumn Nome;
    @FXML
    private TableColumn Cidade;
    @FXML
    private TableColumn Endereco;
    @FXML
    private TableColumn Telefone;
    @FXML
    private Button btnExcluir;
    @FXML
    private Button btnAlterar;
    @FXML
    public void habilitarBotao(){
        if(Tabela.getSelectionModel().getSelectedItem() != null){
            btnExcluir.setDisable(false);
            btnAlterar.setDisable(false);
            
        }
    }
    @FXML
    public void excluir(){
        ClienteDAO.excluir(Tabela.getSelectionModel().getSelectedItem().getCod());
    }
    @FXML
    public void alterar(){
        System.out.println("oi");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//        Tabela.getColumns().addAll(nome,sobrenome);
        
        
        
//        
        Nome.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("Nome"));
        Endereco.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("Endereco"));
        Telefone.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("Telefone"));
        Cidade.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("Cidade"));
        
            Tabela.getItems().addAll(ClienteDAO.consultar());
}    
    
}
