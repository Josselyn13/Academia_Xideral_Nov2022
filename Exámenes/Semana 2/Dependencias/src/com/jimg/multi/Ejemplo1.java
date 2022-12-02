package com.jimg.multi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1 {
	
	public static void main(String[] args) {
        int x = 10, y, z;
        System.out.print("Ingrese y: ");
        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);
        }
        catch (InputMismatchException ime) {
            System.out.println("No es un entero... ¬¬");
        }
        catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por cero");
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace(System.out);
        }
        System.out.println("Adiós");
    }

}
