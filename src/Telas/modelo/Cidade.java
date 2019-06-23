/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.modelo;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Lest
 */
public class Cidade {
    private SimpleIntegerProperty cod;
    private SimpleStringProperty nome;

    public Cidade(int cod, String nome) {
        this.cod = new SimpleIntegerProperty(cod);
        this.nome = new SimpleStringProperty(nome);
    }

    public int getCod() {
        return cod.get();
    }

    public void setCod(int cod) {
        this.cod.set(cod);
    }

    public String getNome() {
        return nome.get();
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }
    
    
    
    
}
