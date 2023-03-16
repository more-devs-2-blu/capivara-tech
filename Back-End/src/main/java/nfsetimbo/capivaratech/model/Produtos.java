package nfsetimbo.capivaratech.model;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Produtos {

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor")
    private String valor;

    public Produtos(String descricao, String valor ) {
        this.descricao = descricao;
        this.valor = valor;
    }
}
