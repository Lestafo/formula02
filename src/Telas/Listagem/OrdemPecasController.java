/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Listagem;

import Telas.modelo.OrdemServico;
import Telas.modelo.Ordem_Pecas;
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
public class OrdemPecasController implements Initializable {

    @FXML
    private TableView<Ordem_Pecas> tabela;
    @FXML
    private TableColumn codigoOrdem;
    @FXML
    private TableColumn codigoPeca;
    @FXML
    private TableColumn Valor;
    @FXML
    private TableColumn quantidade;
    @FXML
    private Button btnAlterar;
    @FXML
    private Button btnExcluir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        codigoOrdem.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("OrdemName"));
        codigoPeca.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("Pecas"));
        Valor.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("Valor"));
        quantidade.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("Quantidade"));
        tabela.getItems().addAll(dao.OrdemPecasDAO.consultar());
    }    

    @FXML
    private void habilitarBotao(MouseEvent event) {
        if(tabela.getSelectionModel().getSelectedItem() != null){
            btnExcluir.setDisable(false);
            btnAlterar.setDisable(false);
            
        }
    }

    @FXML
    private void excluir(ActionEvent event) {
        dao.OrdemPecasDAO.excluir(tabela.getSelectionModel().getSelectedItem().getOrdem().getCod());
    }

    @FXML
    private void adicionar(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/Ordem_de_Peças.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Adicionar Veiculo");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }
    
}
