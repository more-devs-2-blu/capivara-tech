package nfsetimbo.capivaratech.bean;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;

@XmlType(propOrder = {"cpfcnpj", "cidade"})
public class Prestador implements Serializable {

    protected CpfCnpj cpfCnpj;
    protected int cidade;

    public Prestador(CpfCnpj cpfCnpj, int cidade) {
        this.cpfCnpj = cpfCnpj;
        this.cidade = cidade;
    }

    @XmlElement(name = "cpfcnpj")
    public CpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(CpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
    @XmlElement(name = "cidade")
    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }
}
