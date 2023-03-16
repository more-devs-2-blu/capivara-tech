package nfsetimbo.capivaratech.model;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.io.Serializable;

@Data
@XmlType(propOrder = {"cpfcnpj", "cidade"})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Prestador implements Serializable {

    @XmlElement(name = "cpfcnpj")
    private int cpfCnpj;
    @XmlElement(name = "cidade")
    protected int cidade;

    public Prestador(int cpfCnpj, int cidade) {
        this.cpfCnpj = cpfCnpj;
        this.cidade = cidade;
    }


}
