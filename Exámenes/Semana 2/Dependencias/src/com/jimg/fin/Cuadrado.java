package com.jimg.fin;

public class Cuadrado extends FiguraCerrada{
	private double area;
	
	public Cuadrado(double area, int nLados, double tamano) {
		super(nLados, tamano);
		this.area = area;
	}
	
	public void dibujar() {
		System.out.println("Dibujamos un cuadrado");
	}

}
