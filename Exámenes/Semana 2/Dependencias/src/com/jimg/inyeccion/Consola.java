package com.jimg.inyeccion;

public class Consola implements Juego{
	//Atributo
	private String modelo;

	//Se crea el constructor
	public Consola(String modelo) {
		this.modelo = modelo;
	}
	
	//Añadimos get y set
	
	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	//Añadimos un método
	@Override
	public void jugar() {
		System.out.println("Estás jugando " + modelo);
	}

	
	
}
