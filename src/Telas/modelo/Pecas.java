/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.modelo;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Lest
 */
public class Pecas {
    private SimpleIntegerProperty cod;
    private SimpleDoubleProperty valor;
    private SimpleStringProperty nome;

    public Pecas(int cod,double valor, String nome) {
        this.cod = new SimpleIntegerProperty(cod);
        this.valor = new SimpleDoubleProperty(valor);
        this.nome = new SimpleStringProperty(nome);
    }

    public int getCod() {
        return cod.get();
    }

    public void setCod(int cod) {
        this.cod.set(cod);
    }

    
    public double getValor() {
        return valor.get();
    }

    public void setValor(double valor) {
        this.valor.set(valor);
    }

    public String getNome() {
        return nome.get();
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }
    
    
}
