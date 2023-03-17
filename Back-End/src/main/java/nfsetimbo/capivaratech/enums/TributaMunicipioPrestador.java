package nfsetimbo.capivaratech.enums;

import java.io.Serializable;

public enum TributaMunicipioPrestador implements Serializable {

    //LOCAL_DA_PRESTACAO_DO_SERVICO
    S ('S'),

    //MUNICIPIO_PRESTADOR
    N('N');

    private final Character label;

    TributaMunicipioPrestador(Character label) {
        this.label = label;
    }
    public Character getLabel() {
        return label;
    }
}
