package nfsetimbo.capivaratech.bean.enums;

import jakarta.xml.bind.annotation.*;

import java.io.Serializable;

@XmlEnum
@XmlType(name = "tributa_municipio_prestador")
@XmlAccessorType(XmlAccessType.FIELD)
public enum TributaMunicipioPrestador implements Serializable {

    @XmlEnumValue("s")
    //LOCAL_DA_PRESTACAO_DO_SERVICO
    S ('S'),

    @XmlEnumValue("s")
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
