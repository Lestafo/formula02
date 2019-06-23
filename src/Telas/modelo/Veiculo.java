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

    private int cod;
    private SimpleStringProperty modelo;
    private Pessoa cliente;
    private SimpleStringProperty placa;
    private SimpleStringProperty tipo;

//    public Veiculo(String modelo, Pessoa cliente, String placa, String tipo) {
//
//        this.modelo = new SimpleStringProperty(modelo);
//        this.cliente = cliente;
//        this.placa = new SimpleStringProperty(placa);
//        this.tipo = new SimpleStringProperty(tipo);
//    } n é usado
    
    public Veiculo(String modelo,int cod, Pessoa cliente, String placa, String tipo) {
        this.cod = cod;
        this.modelo = new SimpleStringProperty(modelo);
        this.cliente = cliente;
        this.placa = new SimpleStringProperty(placa);
        this.tipo = new SimpleStringProperty(tipo);
    }

    public Veiculo() {
       }

   public String getClientenome(){
       return cliente.getNome();
   }
    
    
    public String getModelo() {
        return modelo.get();
    }

    public void setModelo(String modelo) {
        this.modelo = new SimpleStringProperty(modelo);
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
    public int getCod(){
        return cod;
    }
    @Override
    public String toString(){
        return this.placa.get();
    }
    
    
}
