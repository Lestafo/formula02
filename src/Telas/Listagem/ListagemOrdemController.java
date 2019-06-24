/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Listagem;

import Telas.modelo.OrdemServico;
import Telas.modelo.Pessoa;
import dao.OrdemDAO;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lest
 */
public class ListagemOrdemController implements Initializable {

    @FXML
    private TableView<OrdemServico> tabela;
    @FXML
    private TableColumn ordem;
    @FXML
    private TableColumn codigo;
    @FXML
    private TableColumn situacao;
    @FXML
    private TableColumn progresso;
    @FXML
    private TableColumn data;
    @FXML
    private TableColumn valor;
    @FXML
    private TableColumn pago;
    @FXML
    private TextArea observacao;
    @FXML
    private Button btnAlterar;
    @FXML
    private Button btnExcluir;
    @FXML
    public void selecc(){
        if(tabela.getSelectionModel().getSelectedItem() != null){
            observacao.setText(tabela.getSelectionModel().getSelectedItem().getObservacao());
           
            btnExcluir.setDisable(false);
            btnAlterar.setDisable(false);
            
        
            
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("oila");
        ordem.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("VeiPlaca"));
        situacao.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("Situacao"));
        progresso.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("Progresso"));
        data.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("DataFx"));
        valor.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("Valor"));
        pago.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("isPago"));
        codigo.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("cod"));
        
        
        tabela.getItems().addAll(OrdemDAO.consultar());
        //Cidade.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("Cidade"));
    }    
        @FXML
    private void excluir(ActionEvent event) {
        dao.OrdemDAO.excluir(tabela.getSelectionModel().getSelectedItem().getCod());
    }

    @FXML
    private void adicionar(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/OrdemServico.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Adicionar Ordem");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }
}
