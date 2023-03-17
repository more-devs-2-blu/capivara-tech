package nfsetimbo.capivaratech.enums;

import java.io.Serializable;

public enum Tipo implements Serializable {
//      Tipo da pessoa, informar:
//      • J para Pessoa Jurídica;
//      • F para Pessoa Física;
//      • E para Estrangeiro.

    PESSOA_FISICA('F'),
    PESSOA_JURIDICA('J'),
    ESTRANGEIRO('E');

    private final Character label;

    Tipo(Character label) {
        this.label = label;
    }

    public Character getLabel() {
        return label;
    }
}
