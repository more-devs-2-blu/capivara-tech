package nfsetimbo.capivaratech.model;

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
    private String valor;

    public Produtos(String descricao, String valor ) {
        this.descricao = descricao;
        this.valor = valor;
    }
}
