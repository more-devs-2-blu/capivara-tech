package nfsetimbo.capivaratech.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@XmlRootElement(name = "NFSe")
@XmlAccessorType(XmlAccessType.FIELD)
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
    @XmlElement(name="id")
    private Long id;

    @XmlElement(name="identificador")
    private int identificador;

    @XmlElement(name="nf")
    private ValoresNfse valoresNfse;

    @XmlElement(name="prestador")
    private Prestador prestador;


    @XmlElement(name="tomador")
    private Tomador tomador;

    @XmlElement(name="itens")
<<<<<<< HEAD
    private ItensNfse itens;
=======
    private ListaNfse itens;
>>>>>>> main

    @XmlElement(name="produtos")
    private Produtos produtos;
}
