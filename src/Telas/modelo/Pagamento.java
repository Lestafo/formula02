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
public class Pagamento {
    private static int codAtual;
    private final int cod;
    private SimpleStringProperty datapag;
    private SimpleStringProperty dataVenc;
    private SimpleDoubleProperty valor;
    private OrdemServiço ordemCod;

    public Pagamento(String datapag, String dataVenc, double valor, OrdemServiço ordemCod) {
        cod = codAtual;
        codAtual++;
        this.datapag = new SimpleStringProperty(datapag);
        this.dataVenc = new SimpleStringProperty(dataVenc);
        this.valor = new SimpleDoubleProperty(valor);
        this.ordemCod = ordemCod;
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
    
    
}
