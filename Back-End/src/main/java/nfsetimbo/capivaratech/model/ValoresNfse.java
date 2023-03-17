package nfsetimbo.capivaratech.model;

import jakarta.persistence.Column;
import lombok.Data;

import java.io.Serializable;



@Data
public class ValoresNfse implements Serializable {
    @Column(name = "valor_total")
    private String valorTotal;

    @Column(name = "observacao")
    private String observacao;

    public ValoresNfse(String valorTotal, String observacao) {
        this.valorTotal = valorTotal;
        this.observacao = observacao;
    }
}
