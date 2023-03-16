package nfsetimbo.capivaratech.bean.enums;


import jakarta.xml.bind.annotation.*;

import java.io.Serializable;


@XmlEnum
@XmlType(name = "tipo")
@XmlAccessorType(XmlAccessType.FIELD)
public enum Tipo implements Serializable {
//      Tipo da pessoa, informar:
//      • J para Pessoa Jurídica;
//      • F para Pessoa Física;
//      • E para Estrangeiro.

    @XmlEnumValue("f")
    PESSOA_FISICA('F'),
    @XmlEnumValue("j")
    PESSOA_JURIDICA('J'),
    @XmlEnumValue("e")
    ESTRANGEIRO('E');

    private final Character label;

    Tipo(Character label) {
        this.label = label;
    }

    public Character getLabel() {
        return label;
    }
}
