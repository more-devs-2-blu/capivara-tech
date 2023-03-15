package nfsetimbo.capivaratech.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;

public class ItensNfse implements Serializable {

    protected ListaNfse lista;


    public ListaNfse getLista() {
        return lista;
    }

    public void setLista(ListaNfse lista) {
        this.lista = lista;
    }
}
