package com.jimg.tryres;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejemplo2 {
	
	public static void main(String[] args) throws IOException {
		//FileWriter archivo = null;
		PrintWriter printer = null;
		
		try(FileWriter archivo = new FileWriter("C:\\Users\\HP\\Desktop\\Examen_2\\Archivo2.txt", true)){
			printer = new PrintWriter(archivo);
			
			printer.println("Hola, soy Josselyn");
		} catch (Exception e) {
			//Exception
		}
	}

}
