package nfsetimbo.capivaratech.bean;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;

@XmlType(propOrder = {"identificador", "nf", "prestador", "tomador", "itens", "produtos"})
public class Nfse implements Serializable {

    private int identificador;

    private ValoresNfse valoresNfse;

    private Prestador prestador;

    private Tomador tomador;

    private ItensNfse itens;

    private Produtos produtos;

    @XmlElement(name = "identificador")
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @XmlElement(name = "nf")
    public ValoresNfse getValoresNfse() {
        return valoresNfse;
    }

    public void setValoresNfse(ValoresNfse valoresNfse) {
        this.valoresNfse = valoresNfse;
    }

    @XmlElement(name = "prestador")
    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    @XmlElement(name = "tomador")
    public Tomador getTomador() {
        return tomador;
    }

    public void setTomador(Tomador tomador) {
        this.tomador = tomador;
    }

    @XmlElement(name = "itens")
    public ItensNfse getItens() {
        return itens;
    }

    public void setItens(ItensNfse itens) {
        this.itens = itens;
    }

    @XmlElement(name = "produtos")
    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }
}
