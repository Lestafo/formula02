/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.modelo;

import java.text.SimpleDateFormat;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Lest
 */
public class OrdemServiço {
    private static int codAtual;
    private final int cod;
    private SimpleBooleanProperty isPago;
    private SimpleDoubleProperty valor;
    private SimpleStringProperty progresso;
    private SimpleStringProperty dataFx;
    private SimpleStringProperty situacao;
    private SimpleStringProperty observacao;
    private final Veiculo veiculo;

    public OrdemServiço(boolean isPago, Veiculo veiculo) {
        cod = codAtual;
        codAtual++;
        this.isPago = new SimpleBooleanProperty(isPago);
        this.veiculo = veiculo;
    }

    public OrdemServiço(boolean isPago, double valor, String progresso, String dataFx, String situacao, String observacao, Veiculo veiculo) {
        cod = codAtual;
        codAtual++;
        this.isPago = new SimpleBooleanProperty(isPago);
        this.valor = new SimpleDoubleProperty(valor);
        this.progresso = new SimpleStringProperty(progresso);
        this.dataFx = new SimpleStringProperty(dataFx);
        this.situacao = new SimpleStringProperty(situacao);
        this.observacao = new SimpleStringProperty(observacao);
        this.veiculo = veiculo;
    }

    public boolean getIsPago() {
        return isPago.get();
    }

    public void setIsPago(boolean isPago) {
        this.isPago.set(isPago);
    }

    public double getValor() {
        return valor.get();
    }

    public void setValor(double valor) {
        this.valor.set(valor);
    }

    public String getProgresso() {
        return progresso.get();
    }

    public void setProgresso(String progresso) {
        this.progresso.set(progresso);
    }

    public String getDataFx() {
        return dataFx.get();
    }

    public void setDataFx(String dataFx) {
        this.dataFx.set(dataFx);
    }

    public String getSituacao() {
        return situacao.get();
    }

    public void setSituacao(String situacao) {
        this.situacao.set(situacao);
    }

    public String getObservacao() {
        return observacao.get();
    }

    public void setObservacao(String observacao) {
        this.observacao.set(observacao);
    }
    
    
    
    
}
