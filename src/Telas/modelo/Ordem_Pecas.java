/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.modelo;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Lest
 */
public class Ordem_Pecas {
    private OrdemServiço ordem;
    private Pecas pecas;
    private SimpleIntegerProperty quantidade;
    private SimpleDoubleProperty valor;

    public Ordem_Pecas(OrdemServiço ordem, Pecas pecas, int quantidade, double valor) {
        this.ordem = ordem;
        this.pecas = pecas;
        this.quantidade = new SimpleIntegerProperty(quantidade);
        this.valor = new SimpleDoubleProperty(valor);
    }

    public OrdemServiço getOrdem() {
        return ordem;
    }

    public void setOrdem(OrdemServiço ordem) {
        this.ordem = ordem;
    }

    public Pecas getPecas() {
        return pecas;
    }

    public void setPecas(Pecas pecas) {
        this.pecas = pecas;
    }

    public int getQuantidade() {
        return quantidade.get();
    }

    public void setQuantidade(int quantidade) {
        this.quantidade.set(quantidade);
    }

    public double getValor() {
        return valor.get();
    }

    public void setValor(double valor) {
        this.valor.set(valor);
    }
    
    
    
}
