package nfsetimbo.capivaratech.model;

import jakarta.persistence.Column;
import lombok.Data;
import nfsetimbo.capivaratech.bean.enums.Tipo;

import java.io.Serializable;

@Data
public class Tomador implements Serializable {

    @Column(name = "tipo")
    protected Tipo tipo;
    @Column(name = "cpfcnpj")
    protected int cpfCnpj;
    @Column(name = "nome_razao_social")
    protected String razaoSocial;

    @Column(name = "logradouro")
    protected String logradouro;

    @Column(name = "email")
    protected String email;

    @Column(name = "numero_residencia")
    protected int numero_residencia;
    @Column(name = "bairro")
    protected String bairro;

    @Column(name = "cidade")
    protected int cidade;
    @Column(name = "cep")
    protected int cep;
    @Column(name = "ddd_fone_comercial")
    protected int ddd_fone_comercial;
    @Column(name = "fone_comercial")
    protected int fone_comercial;
    @Column(name = "ddd_fone_residencial")
    protected int ddd_fone_residencial;

    @Column(name = "fone_residencial")
    protected int foneResidencial;

    @Column(name = "ddd_fax")
    protected int dddFax;

    @Column(name = "fone_fax")
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
