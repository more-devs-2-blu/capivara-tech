package nfsetimbo.capivaratech.bean;

import lombok.Getter;
import lombok.Setter;
import nfsetimbo.capivaratech.soap.TypeBase;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

@Getter
@Setter
public class ValorNfs extends TypeBase {

    private Double valorNFS;

    public ValorNfs() {

    }

    public ValorNfs(Element root) {
        Node nodeValorNfs = super.extractNodeByTag(root.getElementsByTagName("ValorNfs"));
        this.valorNFS = nodeValorNfs!=null?Double.parseDouble(nodeValorNfs.getTextContent()):null;
    }
}
