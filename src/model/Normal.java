package model;

public class Normal extends Satelite {

	private String year;

	public Normal(int idSatelite, String nom, String peso, String periodo, String year) {
		super(idSatelite, nom, peso, periodo);
		this.year = year;
	}
	
	

	public Normal() {
		super();
	}



	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Normal [year=" + year + "]";
	}
	
	
	
}
