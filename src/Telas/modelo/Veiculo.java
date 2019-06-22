/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.modelo;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Lest
 */
public class Veiculo {
    private static int codAtual;
    private int cod;
    private SimpleStringProperty modelo;
    private Pessoa cliente;
    private SimpleStringProperty placa;
    private SimpleStringProperty tipo;

    public Veiculo(SimpleStringProperty modelo, Pessoa cliente, SimpleStringProperty placa, SimpleStringProperty tipo) {
        cod = codAtual;
        codAtual++;
        this.modelo = modelo;
        this.cliente = cliente;
        this.placa = placa;
        this.tipo = tipo;
    }
    
    
    public String getModelo() {
        return modelo.get();
    }

    public void setModelo(String modelo) {
        this.modelo = new SimpleStringProperty(modelo);
    }
    
    public String getClienteNome(){
        return this.cliente.getNome();
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public String getPlaca() {
        return placa.get();
    }

    public void setPlaca(String placa) {
        this.placa = new SimpleStringProperty(placa);
    }

    public String getTipo() {
        return tipo.get();
    }

    public void setTipo(String tipo) {
        this.tipo = new SimpleStringProperty(tipo);
    }

    
    
    
}
