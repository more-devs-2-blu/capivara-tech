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
@XmlType(propOrder = {"cpfcnpj", "cidade"})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Prestador implements Serializable {

    @XmlElement(name = "cpfcnpj")
    private int cpfCnpj;
    @XmlElement(name = "cidade")
=======
public class Prestador implements Serializable {

    @Column(name = "cpfcnpj")
    private int cpfCnpj;
    @Column(name = "cidade")
>>>>>>> main
    protected int cidade;

    public Prestador(int cpfCnpj, int cidade) {
        this.cpfCnpj = cpfCnpj;
        this.cidade = cidade;
    }


}
