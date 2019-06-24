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
    private OrdemServico ordem;
    private Pecas pecas;
    private SimpleIntegerProperty quantidade;
    private SimpleDoubleProperty valor;

    public Ordem_Pecas(OrdemServico ordem, Pecas pecas, int quantidade, double valor) {
        this.ordem = ordem;
        this.pecas = pecas;
        this.quantidade = new SimpleIntegerProperty(quantidade);
        this.valor = new SimpleDoubleProperty(valor);
    }
    public String getOrdemName(){
        return Integer.toString(ordem.getCod());
    }
    public OrdemServico getOrdem() {
        return ordem;
    }

    public void setOrdem(OrdemServico ordem) {
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
