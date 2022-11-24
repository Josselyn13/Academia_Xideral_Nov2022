package com.jimg.clasesabstractas;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Triangulo(13.6f));
        figuras.add(new Cuadrado(8.5f));
        figuras.add(new Circulo(9.7f));

        calcularAreas(figuras);
    }

    private static void calcularAreas(List<FiguraGeometrica> figuras) {
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura);
            System.out.println(figura.getArea());
        }

    }
}