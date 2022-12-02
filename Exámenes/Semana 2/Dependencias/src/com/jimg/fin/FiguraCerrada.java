package com.jimg.fin;

//si a una clase le ponemos final, significa que ya no habrá hijos que hereden
//final public class FiguraCerrada extends Figura 
//en este caso afectaría a cuadrado

	public class FiguraCerrada extends Figura {
	private int nLados;
	
	public FiguraCerrada(int nLados, double tamano) {
		super(tamano);
		this.nLados = nLados;
	}
	//ahora si a un método le ponemos final public final void dibujar
	//significa que no puede tener ningún método con el mismo nombre en las subclases que salgan de él
	public void dibujar() {
		System.out.println("Dibujo de una figura cerrada");
	}

}
