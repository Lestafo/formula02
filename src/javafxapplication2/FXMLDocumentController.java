/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import Telas.modelo.Pessoa;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author Lest
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TableView tabela;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/Listagem/ListagemCliente.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("New Window");
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
        //if selection not equals null then enable button
    }
    }
    @FXML
    private void adicionarCliente(ActionEvent ev){
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/Veiculo.fxml"));
        
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
    private void adicionarVeiculo(){
        try {
            System.out.println("manda ele tomanocu");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/Listagem/ListagemVeiculo.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Listar Veículo");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        TableColumn nome = new TableColumn("Nome");
//        TableColumn sobrenome = new TableColumn("Sobrenome");
//        tabela.getColumns().addAll(nome,sobrenome);
//        
//        final ObservableList<Pessoa> gados = FXCollections.observableArrayList(
//        new Pessoa("jonas","O mano"),
//        new Pessoa("janos", "Humano")
//        );
//        
//        nome.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("nome"));
//        sobrenome.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("sobrenome"));
    }    
    
}
