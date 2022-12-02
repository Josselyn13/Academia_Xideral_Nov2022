package com.jimg.inyeccion;

public class Playstation implements Juego{
	String modelo;
	
	public Playstation(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void jugar() {
		System.out.println("Estás jugando " + modelo);
	}
}
