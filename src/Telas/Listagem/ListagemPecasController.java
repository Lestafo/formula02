/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Listagem;

import Telas.modelo.OrdemServico;
import Telas.modelo.Pecas;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lest
 */
public class ListagemPecasController implements Initializable {

    @FXML
    private TableView<Pecas> tabela;
    @FXML
    private TableColumn codigo;
    @FXML
    private TableColumn nome;
    @FXML
    private TableColumn valor;
    @FXML
    private Button btnAlterar;
    @FXML
    private Button btnExcluir;
    
    
    @FXML
    public void habilitarBotao(){
        if(tabela.getSelectionModel().getSelectedItem() != null){
            btnExcluir.setDisable(false);
            btnAlterar.setDisable(false);
            
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        codigo.setCellValueFactory(new PropertyValueFactory<Pecas,String>("Cod"));
        nome.setCellValueFactory(new PropertyValueFactory<Pecas,String>("Nome"));
        valor.setCellValueFactory(new PropertyValueFactory<Pecas,String>("Valor"));
        //data.setCellValueFactory(new PropertyValueFactory<Pecas,String>("DataFx"));[
        tabela.getItems().addAll(dao.PecasDAO.consultar());
    }    

    @FXML
    private void excluir(ActionEvent event) {
        dao.PecasDAO.excluir(tabela.getSelectionModel().getSelectedItem().getCod());
    }

    @FXML
    private void adicionar(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/Peças.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Adicionar Peças");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }
    
}
