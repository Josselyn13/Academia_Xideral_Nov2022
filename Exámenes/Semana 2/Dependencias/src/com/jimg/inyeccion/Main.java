package com.jimg.inyeccion;

public class Main {
	public static void main(String[] args) {
		
		//Se crea una instancia de la clase jugador
		//Ya que se crea la dependencia, podemos cambiar el modelo desde aquí
		//Y ahora se modifica cada que se quiere cambiar de juego
		//Pero normalmente no se usa así entonces crearemos una clase llamada juegoprincipal
		//Juego dispositivo = new Playstation("Playstation");
		//se manda llamar la clase creada JuegoPrincipal
		Juego dispositivo = JuegoPrincipal.create(JuegoPrincipal.TipoDeJuego.Consola);
		Jugador jugador = new Jugador("Pedro", dispositivo);
		jugador.jugar();
		
		//podemos crear un jugador2
		Juego dispositivo2 = JuegoPrincipal.create(JuegoPrincipal.TipoDeJuego.Playstation);
		Jugador jugador2 = new Jugador("Andrea", dispositivo2);
		jugador2.jugar();
		
	}

}
