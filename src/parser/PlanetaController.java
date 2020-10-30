package parser;



import org.w3c.dom.Element;
import org.w3c.dom.Node;

import model.Artificial;
import model.Normal;
import model.Satelite;

public class PlanetaController {

	static final String ET_NOMBRE = "name";
	static final String ET_PESO = "weight";
	static final String ET_TEMPERATURA = "temperature";
	
	static final String ET_PLANETA = "planeta";
	static final String ET_SATELITE = "satellites";
	static final String ET_NORMAL = "normal";
	static final String ET_ARTIFICIAL = "artificial";
	static final String ET_PERIODO = "period";
	static final String ET_ANYO = "year";
	static final String ET_CALIBRE = "caliber"; 
	
	
	public static Satelite leerSatelite(Element elemNorArt) {
		
		Satelite satelite = null;
		if (elemNorArt.getTagName().equalsIgnoreCase(ET_NORMAL)) {
			satelite = leerNormal(elemNorArt);
		} else if (elemNorArt.getTagName().equalsIgnoreCase(ET_ARTIFICIAL)) {
			satelite = leerArtificial(elemNorArt);
		}
		return satelite;
	}
	
	
    
    public static Normal leerNormal(Element elemNormal) {
    	Normal n = new Normal();
    	return n;
    }
    
    public static Artificial leerArtificial(Element elemArtifical) {
    	Artificial a = new Artificial();
    	return a;
    }
    
    
    
    
    public static String getValorEtiqueta(String etiqueta, Element element) {
        Node nValue = element.getElementsByTagName(etiqueta).item(0);
        return nValue.getChildNodes().item(0).getNodeValue();
    }

    public static Element getElementEtiqueta(String etiqueta, Element element) {
        return (Element) element.getElementsByTagName(etiqueta).item(0);
    }
}
