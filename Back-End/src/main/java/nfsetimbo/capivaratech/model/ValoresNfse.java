package nfsetimbo.capivaratech.model;

<<<<<<< HEAD
import jakarta.xml.bind.annotation.*;
=======
import jakarta.persistence.Column;
>>>>>>> main
import lombok.Data;

import java.io.Serializable;



@Data
<<<<<<< HEAD
@XmlRootElement
@XmlType(propOrder = {"valor_total", "observacao"})
@XmlAccessorType(XmlAccessType.FIELD)
public class ValoresNfse implements Serializable {

    @XmlElement(name = "valor_total")
    private String valorTotal;

    @XmlElement(name = "observacao")
=======
public class ValoresNfse implements Serializable {

    @Column(name = "valor_total")
    private String valorTotal;

    @Column(name = "observacao")
>>>>>>> main
    private String observacao;

    public ValoresNfse(String valorTotal, String observacao) {
        this.valorTotal = valorTotal;
        this.observacao = observacao;
    }
}
