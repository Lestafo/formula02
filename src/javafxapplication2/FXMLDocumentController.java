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
    
    private void handleButtonAction(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/Listagem/ListagemPecas.fxml"));
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
    private void adicionarCliente(ActionEvent ev){
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/OrdemServico.fxml"));
            System.out.println("ASASASASAS");
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
    private void adicionarVeiculo(){
        try {
            System.out.println("manda ele tomanocu");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/Listagem/ListagemPagamento.fxml"));
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

    @FXML
    private void ListClien(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/Listagem/ListagemCliente.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Listar Cliente");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }

    @FXML
    private void manClien(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/PaisManutencao.fxml"));
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
    private void listVeic(ActionEvent event) {
        try {
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

    @FXML
    private void manVeic(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/Veiculo.fxml"));
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

    @FXML
    private void listPec(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/Listagem/ListagemPecas.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Listar Pecas");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }

    @FXML
    private void manPec(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/Peças.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Adicionar Pecas");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }

    @FXML
    private void listOrd(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/Listagem/ListagemOrdem.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Listar Ordem");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }

    @FXML
    private void manOrd(ActionEvent event) {
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

    @FXML
    private void listOrdPec(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/Listagem/OrdemPecas.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Listar ordem_Pecas");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }

    @FXML
    private void manOrdPEc(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/Ordem_de_Peças.fxml"));
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

    @FXML
    private void listPag(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/Listagem/ListagemPagamento.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Listar Pagamento");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }

    @FXML
    private void manPag(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/Pagamento.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Adicionar Pagamentos");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }

    @FXML
    private void listCid(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/Listagem/ListagemCidade.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Listar Cidades");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }

    @FXML
    private void manCid(ActionEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Telas/manutencao/CidadeManutencao.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Adicionar Cidade");
        stage.setScene(scene);
        stage.show();
        } catch (IOException e) {
        
        }
    }
    
}
