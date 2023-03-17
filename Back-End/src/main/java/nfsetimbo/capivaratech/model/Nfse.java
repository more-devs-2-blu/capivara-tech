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

    @Column(name="identificador")
    private int identificador;
    @Column(name="nf")
    private ValoresNfse valoresNfse;
    @Column(name="prestador")
    private Prestador prestador;
    @Column(name="tomador")
    private Tomador tomador;
    @Column(name="itens")
    private ListaNfse itens;
    @Column(name="produtos")
    private Produtos produtos;
}
