package com.jimg.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Triangulo(7.4f));
        figuras.add(new Cuadrado(19.4f));
        figuras.add(new Circulo(8.7f));

        calcularAreas(figuras);
    }

    private static void calcularAreas(List<FiguraGeometrica> figuras) {
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura);
            System.out.println(figura.getArea());
        }

    }


}