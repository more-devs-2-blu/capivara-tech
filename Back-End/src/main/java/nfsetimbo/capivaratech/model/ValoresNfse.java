package nfsetimbo.capivaratech.model;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.io.Serializable;



@Data
@XmlRootElement
@XmlType(propOrder = {"valor_total", "observacao"})
@XmlAccessorType(XmlAccessType.FIELD)
public class ValoresNfse implements Serializable {

    @XmlElement(name = "valor_total")
    private String valorTotal;

    @XmlElement(name = "observacao")
    private String observacao;

    public ValoresNfse(String valorTotal, String observacao) {
        this.valorTotal = valorTotal;
        this.observacao = observacao;
    }
}
