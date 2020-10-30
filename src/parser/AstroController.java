package parser;



import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.Astro;

public class AstroController {
	
	static final String ET_ASTRO = "astro";
	
	private File ficheroXML = null;
	private Document doc = null;
	private Astro astro = null;
	
	public AstroController(File ficheroXML) {
		super();
		this.ficheroXML = ficheroXML;
		this.astro = new Astro();
	}

	public AstroController(Astro astro) {
		super();
		this.astro = astro;
	}

	public AstroController(File ficheroXML, Document doc, Astro astro) {
		super();
		this.ficheroXML = ficheroXML;
		this.doc = doc;
		this.astro = astro;
	}
	
	public void recuperarXML() throws ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		this.doc = builder.parse(ficheroXML);
	}
	
	public Astro leerDOM() {
		Element astro = this.doc.getDocumentElement();
		NodeList listaPS = astro.getChildNodes();
		this.astro.clear();
		
		for (int i = 0; i < listaPS.getLength(); i++) {
			if (listaPS.item(i).getNodeType()==Node.ATTRIBUTE_NODE) {
				this.astro.add(PlanetaController.leerSatelite((Element)listaPS.item(i)));
			}
		}
		return this.astro;
		
	}
	

}
