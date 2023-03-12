package nfsetimbo.capivaratech.bean;


import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "tipo")
public enum Tipo {
//      Tipo da pessoa, informar:
//      • J para Pessoa Jurídica;
//      • F para Pessoa Física;
//      • E para Estrangeiro.

    @XmlEnumValue("f") PESSOA_FISICA("f"),
    @XmlEnumValue("j") PESSOA_JURIDICA("j"),
    @XmlEnumValue("e") ESTRANGEIRO("e");

    private final String label;

    Tipo(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
