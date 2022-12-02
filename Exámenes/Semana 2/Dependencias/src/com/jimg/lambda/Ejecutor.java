package com.jimg.lambda;

public class Ejecutor {
	public static void main(String[] args) {

		//creamos una referencia hacía la interfaz
		//usamos expresión lambda
		ICalcu calculadora = (n1, n2) -> {
			double resultado = n1+n2;
			System.out.println("La suma es: "+resultado);
		};
		ICalcu calculadora1 = (n1, n2) -> {
			double resultado = n1-n2;
			System.out.println("La suma es: "+resultado);
		};
		
		//para imprimir hacemos referencia a la variable que apunta a la clase
		calculadora.operacion(5, 8);
		calculadora1.operacion(15, 8);
		
	}

}
