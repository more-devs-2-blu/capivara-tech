package nfsetimbo.capivaratech.model;

import jakarta.persistence.*;
import lombok.Data;
import nfsetimbo.capivaratech.bean.enums.Tipo;
import org.hibernate.validator.constraints.UUID;

import java.io.Serializable;

@Entity
@Data
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,  updatable = false)
    private Long id;

    private String cpfCnpj;

    private Tipo TipoPessoa;

    private String razaoSocial;

    private Long idUser;

    private String link;

    @Column(nullable = false, updatable = false)
    private UUID clienteCode;
}
