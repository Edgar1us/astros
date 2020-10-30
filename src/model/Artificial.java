package model;

public class Artificial extends Satelite {

	
	private int calibre;

	public Artificial(int idSatelite, String nom, String peso, String periodo, int calibre) {
		super(idSatelite, nom, peso, periodo);
		this.calibre = calibre;
	}
	
	

	public Artificial() {
		super();
	}



	public int getCalibre() {
		return calibre;
	}

	public void setCalibre(int calibre) {
		this.calibre = calibre;
	}

	@Override
	public String toString() {
		return "Artificial [calibre=" + calibre + "]";
	}
	
	
	
	
	
	
	
}
