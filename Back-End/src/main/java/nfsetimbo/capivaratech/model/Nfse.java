package nfsetimbo.capivaratech.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Nfse implements Serializable {

    @Override
    public String toString() {
        return "Nfse{" +
                "id=" + id +
                ", identificador=" + identificador +
                ", valoresNfse=" + valoresNfse +
                ", prestador=" + prestador +
                ", tomador=" + tomador +
                ", itens=" + itens +
                ", produtos=" + produtos +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,  updatable = false)
    private Long id;

    private int identificador;

    private ValoresNfse valoresNfse;

    private Prestador prestador;

    private Tomador tomador;

    private ItensNfse itens;

    private Produtos produtos;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public ValoresNfse getValoresNfse() {
        return valoresNfse;
    }

    public void setValoresNfse(ValoresNfse valoresNfse) {
        this.valoresNfse = valoresNfse;
    }


    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }


    public Tomador getTomador() {
        return tomador;
    }

    public void setTomador(Tomador tomador) {
        this.tomador = tomador;
    }


    public ItensNfse getItens() {
        return itens;
    }

    public void setItens(ItensNfse itens) {
        this.itens = itens;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }
}
