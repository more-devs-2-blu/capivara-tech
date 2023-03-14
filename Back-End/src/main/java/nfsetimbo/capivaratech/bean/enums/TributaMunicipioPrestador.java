package nfsetimbo.capivaratech.bean.enums;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "tributa_municipio_prestador")
public enum TributaMunicipioPrestador {

    LOCAL_DA_PRESTACAO_DO_SERVICO(0),

    MUNICIPIO_PRESTADOR(1);

    private final int value;

    private TributaMunicipioPrestador(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }


}
