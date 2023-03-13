package nfsetimbo.capivaratech.bean;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import nfsetimbo.capivaratech.soap.TypeBase;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

@Getter
@Setter
public class CpfCnpj extends TypeBase {

    protected int cpfCnpj;

    public CpfCnpj(){
    }

    public CpfCnpj(Element root) {
        Node nodeCpfCnpj = super.extractNodeByTag(root.getElementsByTagName("CpfCnpj" ));
        this.cpfCnpj = nodeCpfCnpj != null ? Integer.parseInt(nodeCpfCnpj.getTextContent()) : 0;
    }
    public String generateCpfcnpj() {
        return "<cpfcnpj>"
                    + cpfCnpj +
                "</cpfcnpj>";
    }
}
