package model;

import java.util.ArrayList;

public class Planeta {

	private int idPlaneta;
	private String nombre;
	private Float peso;
	private int temperatura;
	private ArrayList<Satelite> satelites;
	
	public Planeta(String nombre, Float peso, int temperatura, ArrayList<Satelite> satelites) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.temperatura = temperatura;
		this.satelites = satelites;
	}

	public Planeta() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public ArrayList<Satelite> getSatelites() {
		return satelites;
	}

	public void setSatelites(ArrayList<Satelite> satelites) {
		this.satelites = satelites;
	}
	
	
	
}
