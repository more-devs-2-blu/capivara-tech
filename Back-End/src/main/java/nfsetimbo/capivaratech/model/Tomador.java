package nfsetimbo.capivaratech.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;
import nfsetimbo.capivaratech.bean.enums.Tipo;

import java.io.Serializable;

@Data
@XmlType(propOrder = {"tipo", "cpfcnpj", "nome_razao_social"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Tomador implements Serializable {

    @XmlElement(name = "tipo")
    protected Tipo tipo;
    @XmlElement(name = "cpfcnpj")
    protected int cpfCnpj;
    @XmlElement(name = "nome_razao_social")
    protected String razaoSocial;

    @XmlElement(name = "logradouro")
    protected String logradouro;

    @XmlElement(name = "email")
    protected String email;

    @XmlElement(name = "numero_residencia")
    protected int numero_residencia;
    @XmlElement(name = "bairro")
    protected String bairro;

    @XmlElement(name = "cidade")
    protected int cidade;
    @XmlElement(name = "cep")
    protected int cep;
    @XmlElement(name = "ddd_fone_comercial")
    protected int ddd_fone_comercial;
    @XmlElement(name = "fone_comercial")
    protected int fone_comercial;
    @XmlElement(name = "ddd_fone_residencial")
    protected int ddd_fone_residencial;

    @XmlElement(name = "fone_residencial")
    protected int foneResidencial;

    @XmlElement(name = "ddd_fax")
    protected int dddFax;

    @XmlElement(name = "fone_fax")
    protected int foneFax;

    public Tomador() {}

    public Tomador(Tipo tipo, int cpfCnpj, String razaoSocial, String logradouro, String email, int numero_residencia, String bairro, int cidade, int cep, int ddd_fone_comercial, int fone_comercial, int ddd_fone_residencial, int foneResidencial, int dddFax, int foneFax) {
        this.tipo = tipo;
        this.cpfCnpj = cpfCnpj;
        this.razaoSocial = razaoSocial;
        this.logradouro = logradouro;
        this.email = email;
        this.numero_residencia = numero_residencia;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.ddd_fone_comercial = ddd_fone_comercial;
        this.fone_comercial = fone_comercial;
        this.ddd_fone_residencial = ddd_fone_residencial;
        this.foneResidencial = foneResidencial;
        this.dddFax = dddFax;
        this.foneFax = foneFax;
    }
}
