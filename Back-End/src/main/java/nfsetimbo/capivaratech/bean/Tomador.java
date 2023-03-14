package nfsetimbo.capivaratech.bean;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import nfsetimbo.capivaratech.bean.enums.Tipo;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.io.Serializable;

@XmlType(propOrder = {"tipo", "cpfcnpj", "nome_razao_social"})
public class Tomador implements Serializable {

    protected Tipo tipo;
    protected CpfCnpj cpfCnpj;
    protected String razaoSocial;

    @XmlElement(name = "tipo")
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @XmlElement(name = "cpfcnpj")
    public CpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(CpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    @XmlElement(name = "nome_razao_social")
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
