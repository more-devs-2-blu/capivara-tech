package nfsetimbo.capivaratech.bean;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;

@XmlType(propOrder = "valor_total")
public class ValorNFS implements Serializable {

    private double valorNFS;

    @XmlElement(name = "Valor")
    public double getValorNFS() {
        return valorNFS;
    }

    public void setValorNFS(double valorNFS) {
        this.valorNFS = valorNFS;
    }
}
