package nfsetimbo.capivaratech.bean;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;

@XmlType(propOrder = {"lista"})
public class ItensNfse implements Serializable {

    protected ListaNfse lista;


    @XmlElement(name = "lista")
    public ListaNfse getLista() {
        return lista;
    }

    public void setLista(ListaNfse lista) {
        this.lista = lista;
    }
}
