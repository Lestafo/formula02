/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.modelo;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Lest
 */
public class Pecas {
    private static int codAtual;
    private final int cod;
    private SimpleDoubleProperty valor;
    private SimpleStringProperty nome;

    public Pecas(double valor, String nome) {
        cod = codAtual;
        codAtual++;
        this.valor = new SimpleDoubleProperty(valor);
        this.nome = new SimpleStringProperty(nome);
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
