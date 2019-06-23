/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Listagem;

import Telas.modelo.OrdemServico;
import Telas.modelo.Pessoa;
import dao.OrdemDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Lest
 */
public class ListagemOrdemController implements Initializable {

    @FXML
    private TableView tabela;
    @FXML
    private TableColumn ordem;
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("oila");
        ordem.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("VeiPlaca"));
        situacao.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("Situacao"));
        progresso.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("Progresso"));
        data.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("DataFx"));
        valor.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("Valor"));
        pago.setCellValueFactory(new PropertyValueFactory<OrdemServico,String>("isPago"));
        //observacao.setText(new PropertyValueFactory<OrdemServiço, String>("Situacao").getProperty());
        
        tabela.getItems().addAll(OrdemDAO.consultar());
        //Cidade.setCellValueFactory(new PropertyValueFactory<Pessoa,String>("Cidade"));
    }    
    
}
