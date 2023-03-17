package nfsetimbo.capivaratech.model;

import jakarta.persistence.Column;
import lombok.Data;

import java.io.Serializable;

@Data
public class Prestador implements Serializable {

    @Column(name = "cpfcnpj")
    private int cpfCnpj;
    @Column(name = "cidade")
    protected int cidade;

    public Prestador(int cpfCnpj, int cidade) {
        this.cpfCnpj = cpfCnpj;
        this.cidade = cidade;
    }


}
