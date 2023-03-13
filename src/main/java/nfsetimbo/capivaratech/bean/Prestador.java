package nfsetimbo.capivaratech.bean;

import nfsetimbo.capivaratech.soap.TypeBase;

public class Prestador extends TypeBase {

    protected CpfCnpj cpfCnpj;

    protected int cidade;

    public Prestador(CpfCnpj cpfCnpj, int cidade) {
        this.cpfCnpj = cpfCnpj;
        this.cidade = cidade;
    }

    public String gerarPrestador() {
        return "<Prestador>" +
                    "<cpfcnpj>"
                        + cpfCnpj +
                    "<cpfcnpj>" +
                    "<cidade>"
                        + cidade +
                    "</cidade>" +
                "</Prestador>";
    }
}
