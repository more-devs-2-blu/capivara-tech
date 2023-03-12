package nfsetimbo.capivaratech.soap;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public abstract class TypeBase {
    public Element extractNodeByTag(NodeList elements) {
        if(elements!=null)
            return (Element) elements.item(0);
        return null;
    }
}
