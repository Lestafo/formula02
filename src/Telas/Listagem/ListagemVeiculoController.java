/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Listagem;


import Telas.modelo.Veiculo;
import dao.VeiculoDAO;
import java.net.URL;
import java.util.ResourceBundle;
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
public class ListagemVeiculoController implements Initializable {

    @FXML
    private TableView<Telas.modelo.Veiculo> tabela;
    @FXML
    private TableColumn modelo;
    @FXML
    private TableColumn tipo;
    @FXML
    private TableColumn placa;
    @FXML
    private TableColumn cliente;
    
    @FXML
    public void excluir(){
        VeiculoDAO.excluir((tabela.getSelectionModel().getSelectedItem().getCod()));
        System.out.println("mininim");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        modelo.setCellValueFactory(new PropertyValueFactory<Veiculo,String>("Modelo"));
        tipo.setCellValueFactory(new PropertyValueFactory<Veiculo,String>("Tipo"));
        placa.setCellValueFactory(new PropertyValueFactory<Veiculo,String>("Placa"));
        cliente.setCellValueFactory(new PropertyValueFactory<Veiculo,String>("Clientenome"));
        System.out.println("ababababa");
        //tabela.getItems().addAll(VeiculoDAO.consultar());
        
    }    
    
}
