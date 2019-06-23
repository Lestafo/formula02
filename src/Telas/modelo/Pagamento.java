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
public class Pagamento {
    private SimpleIntegerProperty cod;
    private SimpleStringProperty datapag;
    private SimpleStringProperty dataVenc;
    private SimpleDoubleProperty valor;
    private OrdemServiço ordemCod;

    public Pagamento(int cod,String datapag, String dataVenc, double valor, OrdemServiço ordemCod) {
        this.cod = new SimpleIntegerProperty(cod);
        this.datapag = new SimpleStringProperty(datapag);
        this.dataVenc = new SimpleStringProperty(dataVenc);
        this.valor = new SimpleDoubleProperty(valor);
        this.ordemCod = ordemCod;
    }

    public int getCod() {
        return cod.get();
    }

    public void setCod(int cod) {
        this.cod.set(cod);
    }
    

    public String getDatapag() {
        return datapag.get();
    }

    public void setDatapag(String datapag) {
        this.datapag.set(datapag);
    }

    public String getDataVenc() {
        return dataVenc.get();
    }

    public void setDataVenc(String dataVenc) {
        this.dataVenc.set(dataVenc);
    }

    public double getValor() {
        return valor.get();
    }

    public void setValor(double valor) {
        this.valor.set(valor);
    }

    public OrdemServiço getOrdemCod() {
        return ordemCod;
    }

    public void setOrdemCod(OrdemServiço ordemCod) {
        this.ordemCod = ordemCod;
    }
    @Override
    public String toString(){
        return Integer.toString(this.getCod());
    }
    
}
