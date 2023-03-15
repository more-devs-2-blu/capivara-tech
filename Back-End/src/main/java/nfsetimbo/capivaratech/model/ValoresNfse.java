package nfsetimbo.capivaratech.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;



public class ValoresNfse implements Serializable {

    private double valorTotal;

    public ValoresNfse() {
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }





}
