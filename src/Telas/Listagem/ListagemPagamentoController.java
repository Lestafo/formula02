/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Listagem;

import Telas.modelo.Pagamento;
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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lest
 */
public class ListagemPagamentoController implements Initializable {

    @FXML
    private TableView<Pagamento> tabela;
    @FXML
    private TableColumn codigo;
    @FXML
    private TableColumn dataPag;
    @FXML
    private TableColumn dataVenc;
    @FXML
    private TableColumn valor;
    @FXML
    private TableColumn ordemCod;
    @FXML
    private Button btnExcluir;
    @FXML
    private Button btnAlterar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        codigo.setCellValueFactory(new PropertyValueFactory<Pagamento,String>("Cod"));
        dataPag.setCellValueFactory(new PropertyValueFactory<Pagamento,String>("Datapag"));
        dataVenc.setCellValueFactory(new PropertyValueFactory<Pagamento,String>("DataVenc"));
        valor.setCellValueFactory(new PropertyValueFactory<Pagamento,String>("Valor"));
        ordemCod.setCellValueFactory(new PropertyValueFactory<Pagamento,String>("OrdemCod"));
        tabela.getItems().addAll(dao.PagamentoDAO.consultar());
    }    

    @FXML
    private void excluir(ActionEvent event) {
           
    
        dao.PagamentoDAO.excluir(tabela.getSelectionModel().getSelectedItem().getCod());
    
    }

    @FXML
    private void adicionar(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/Pagamento.fxml"));
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
    private void habilitarBotao(MouseEvent event) {
        if(tabela.getSelectionModel().getSelectedItem() != null){
            btnExcluir.setDisable(false);
            btnAlterar.setDisable(false);
            
        }
    }
    
}
