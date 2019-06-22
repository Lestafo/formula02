/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Listagem;

import Telas.modelo.Pessoa;
import dao.ClienteDao;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    private TableView Tabela;
    @FXML
    private TableColumn Nome;
    @FXML
    private TableColumn Cidade;
    @FXML
    private TableColumn Endereco;
    @FXML
    private TableColumn Telefone;
            
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//        Tabela.getColumns().addAll(nome,sobrenome);
        
        
        final ObservableList<Pessoa> gados = FXCollections.observableArrayList(
        new Pessoa("Jenny", "Casa do carai",(long)8675309, 1)
        //new Pessoa("janos", "Humano"),
//        new Pessoa("Pipizudo", "louco")
        );
//        
        Nome.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("Nome"));
        Endereco.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("Endereco"));
        Telefone.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("Telefone"));
        Cidade.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("Cidade"));
        
        Tabela.setItems(gados);
//       ArrayList<Pessoa> arr = new ArrayList();
//       arr.add(new Pessoa("Arr", "Err"));
////      arr.add("Err");
////        Pessoa pes = new Pessoa("asteristico", "asterástico");
////        //Tabela.getSelectionModel().getSelectedItem();
//        Tabela.getItems().add(new Pessoa("alevino", "maroto"));
//        Tabela.getItems().add(new Pessoa("Aveztruz", "Arborícola"));
            Tabela.getItems().addAll(ClienteDao.consultar());
//        //só precisa salvar como string mesmo n esquenta mano
}    
    
}
