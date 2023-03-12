package nfsetimbo.capivaratech.bean;


import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlElement;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

public class CpfCnpj {

    @CNPJ
    @CPF
    @Size(min = 11, max = 14)
    public int cpfcnpj;

    public CpfCnpj(){
    }

    @XmlElement(name = "cpfcnpj")
    public int getCpfCnpj() {
        return cpfcnpj;
    }

    public void setCpfCnpj(int cpfCnpj) {
        this.cpfcnpj = cpfcnpj;
    }
}
