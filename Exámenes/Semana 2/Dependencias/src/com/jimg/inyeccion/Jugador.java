package com.jimg.inyeccion;

public class Jugador {
	//Atributo
	private String nombre;
	//private Consola consola;
	private Juego dispositivoJuego;

	
	//Creamos un constructor al que le pasaremos el nombre del jugador
	public Jugador(String nombre, Juego dispositivoJuego) {
		this.nombre = nombre;
		this.dispositivoJuego = dispositivoJuego;
		//instanciamos una consola, al aplicar inyectores no podemos instanciar en esta clase por lo que la pasamos como un parámetro
		//consola = new Consola("PS4");
	}
	
	//Agregamos un método
	public void jugar() {
		dispositivoJuego.jugar();
	}

}
