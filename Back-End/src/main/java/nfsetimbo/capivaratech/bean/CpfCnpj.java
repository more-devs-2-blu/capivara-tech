package nfsetimbo.capivaratech.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CpfCnpj {

    protected int cpfCnpj;

    public CpfCnpj(){
    }

    public CpfCnpj(int cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}
