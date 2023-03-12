package nfsetimbo.capivaratech.bean;

import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"cpfcnpj", "inscricaoMunicipal"})
public class Prestador {
    private CpfCnpj cpfCnpj;

}
