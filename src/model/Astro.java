package model;

import java.util.ArrayList;

public class Astro {

	private int idAstro;
	private String sistemaSolar;
	private String nombre;
	private Float peso;
	private String tipo;
	private ArrayList<Planeta> planetas;
	
	public Astro(String sistemaSolar, String nombre, Float peso, String tipo, ArrayList<Planeta> planetas) {
		super();
		this.sistemaSolar = sistemaSolar;
		this.nombre = nombre;
		this.peso = peso;
		this.tipo = tipo;
		this.planetas = planetas;
	}

	public Astro() {
		super();
	}

	public String getSistemaSolar() {
		return sistemaSolar;
	}

	public void setSistemaSolar(String sistemaSolar) {
		this.sistemaSolar = sistemaSolar;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Planeta> getPlanetas() {
		return planetas;
	}

	public void setPlanetas(ArrayList<Planeta> planetas) {
		this.planetas = planetas;
	}
	
	
	
}
