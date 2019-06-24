/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Listagem;

import Telas.modelo.Cidade;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lest
 */
public class ListagemCidadeController implements Initializable {

    @FXML
    private TableView<Cidade> tabela;
    @FXML
    private TableColumn codigo;
    @FXML
    private TableColumn nome;
    @FXML
    private Button btnAdicionar;
    @FXML
    private Button btnExcluir;
    @FXML
    private Button btnAlterar;
    /**
     * Initializes the controller class.
     */
    @FXML
    public void adicionar(){
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/CidadeManutencao.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Adicionar Cliente");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }
    @FXML
    public void ref(){
        tabela.refresh();
        System.out.println("eu eamsnas");
        tabela.getItems().clear();
        tabela.getItems().addAll(dao.CidadeDAO.consultar());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        codigo.setCellValueFactory(new PropertyValueFactory<Cidade,String>("Cod"));
        nome.setCellValueFactory(new PropertyValueFactory<Cidade,String>("Nome"));
        tabela.getItems().addAll(dao.CidadeDAO.consultar());
        
    }    

    @FXML
    private void excluir(ActionEvent event) {
        dao.CidadeDAO.excluir(tabela.getSelectionModel().getSelectedItem().getCod());
    }

    @FXML
    private void habilitarBotao(MouseEvent event) {
        if(tabela.getSelectionModel().getSelectedItem() != null){
            btnExcluir.setDisable(false);
            btnAlterar.setDisable(false);
            
        }
    }
    
}
