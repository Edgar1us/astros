package model;

public class  Satelite {

	protected int idSatelite;
	protected String nom;
	protected String peso;
	protected String periodo;
	
	public Satelite(int idSatelite, String nom, String peso, String periodo) {
		super();
		this.idSatelite = idSatelite;
		this.nom = nom;
		this.peso = peso;
		this.periodo = periodo;
	}

	public Satelite() {
		super();
	}

	public int getIdSatelite() {
		return idSatelite;
	}

	public void setIdSatelite(int idSatelite) {
		this.idSatelite = idSatelite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	@Override
	public String toString() {
		return "Satelite [idSatelite=" + idSatelite + ", nom=" + nom + ", peso=" + peso + ", periodo=" + periodo + "]";
	}
	
	
	
}
