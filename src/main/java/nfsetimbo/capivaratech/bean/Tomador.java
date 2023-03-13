package nfsetimbo.capivaratech.bean;

import lombok.Getter;
import lombok.Setter;
import nfsetimbo.capivaratech.bean.enums.Tipo;
import nfsetimbo.capivaratech.soap.TypeBase;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

@Getter
@Setter
public class Tomador extends TypeBase {

    private Tipo tipo;
    private CpfCnpj cpfCnpj;

    public Tomador(Element root) {
        Node nodeTipo = super.extractNodeByTag(root.getElementsByTagName("Tipo"));
        Node nodeCpfCnpj = super.extractNodeByTag(root.getElementsByTagName("CpfCnpj"));

        this.tipo = nodeTipo!=null? Tipo.valueOf(nodeTipo.getTextContent()) : null;
        this.cpfCnpj = nodeCpfCnpj!=null ? new CpfCnpj((Element) nodeCpfCnpj) : null;
    }
}
