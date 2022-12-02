package com.jimg.inyeccion;

public class JuegoPrincipal {
	//Esta clase se encargará de crear y retornar las instancias
	//Se encargará de hacerlo todo
	public enum TipoDeJuego {Playstation, Consola}
	
	//necesitamos un método estático que retorne una instancia de un objeto de juego
	public static Juego create(TipoDeJuego tipo) {
		Juego juego;
		switch (tipo) {
		case Playstation:
			juego = new Playstation("PlayStation");
			break;
		default:	
			juego = new Consola("PS4");
			break;
		}
		//ahora retornaremos el objeto juego
		return juego;
	}

}
