package nfsetimbo.capivaratech.model;

<<<<<<< HEAD
import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlType(propOrder = {"descricao", "valor"} )
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Produtos {

    @XmlElement(name = "descricao")
    private String descricao;

    @XmlElement(name = "valor")
=======
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Produtos {

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor")
>>>>>>> main
    private String valor;

    public Produtos(String descricao, String valor ) {
        this.descricao = descricao;
        this.valor = valor;
    }
}
