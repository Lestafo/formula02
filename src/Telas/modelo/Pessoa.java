/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.modelo;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Lest
 */
public class Pessoa {
    private SimpleIntegerProperty cod;
    private SimpleStringProperty nome;
    private SimpleStringProperty endereco;
    private SimpleIntegerProperty cidade;
    private SimpleLongProperty telefone;

    public int getCod() {
        return cod.get();
    }

    public Pessoa(String nome, String endereco) {
        this.nome = new SimpleStringProperty(nome);
        this.endereco = new SimpleStringProperty(endereco);
    }
    public Pessoa(int cod,String nome, String endereco) {
        this.cod = new SimpleIntegerProperty(cod);
        this.nome = new SimpleStringProperty(nome);
        this.endereco = new SimpleStringProperty(endereco);
    }
    public Pessoa(String nome, String endereco, int cidade){
        this.nome = new SimpleStringProperty(nome);
        this.endereco = new SimpleStringProperty(endereco);
        this.cidade = new SimpleIntegerProperty(cidade);
    }
    public Pessoa(String nome, String endereco, Long telefone){
        this.nome = new SimpleStringProperty(nome);
        this.endereco = new SimpleStringProperty(endereco);
        this.telefone = new SimpleLongProperty(telefone);
    }
    public Pessoa(String nome, String endereco, Long telefone, int cidade){
        this.nome = new SimpleStringProperty(nome);
        this.endereco = new SimpleStringProperty(endereco);
        this.telefone = new SimpleLongProperty(telefone);
        this.cidade = new SimpleIntegerProperty(cidade);
    }
        public Pessoa(int cod,String nome, String endereco, Long telefone, int cidade){
        this.cod = new SimpleIntegerProperty(cod);
        this.nome = new SimpleStringProperty(nome);
        this.endereco = new SimpleStringProperty(endereco);
        this.telefone = new SimpleLongProperty(telefone);
        this.cidade = new SimpleIntegerProperty(cidade);
    }

    public String getEndereco() {
        return endereco.get();
    }

    public void setEndereco(String endereco) {
        this.endereco.set(endereco);
    }

    public int getCidade() {
        return cidade.get();
    }

    public void setCidade(int cidade) {
        this.cidade.set(cidade);
    }

    public long getTelefone() {
        return telefone.get();
    }

    public void setTelefone(long telefone) {
        this.telefone.set(telefone);
    }
    

    
    public String getNome() {
        return nome.get();
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }



    
    
    
}
