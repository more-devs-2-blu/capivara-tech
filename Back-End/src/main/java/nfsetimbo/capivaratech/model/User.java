package nfsetimbo.capivaratech.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
public class User implements Serializable {

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", tipoPessoa='" + tipoPessoa + '\'' +
                ", estado='" + estado + '\'' +
                ", cnpjcpf='" + cnpjcpf + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", nomeRazaoSocial='" + nomeRazaoSocial + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", email='" + email + '\'' +
                ", cep='" + cep + '\'' +
                ", userCode=" + userCode +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,  updatable = false)
    private Long id;

    private String tipoPessoa;
    private String estado;
    private String  cnpjcpf;
    private String inscricaoEstadual;
    private String nomeRazaoSocial;
    private String sobrenome;
    private String logradouro;
    private String email;
    private String cep;

    private String senha;

    @Column(nullable = false, updatable = false)
    private UUID userCode;


}
