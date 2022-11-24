package com.jimg.interfaces;

public class Circulo implements FiguraGeometrica {

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float getArea() {
        return 3.1416f * (radio * radio);
    }

    @Override
    public String toString() {
        return "Área: " + this.getClass().getSimpleName() + ": pi*(r^2)";
    }
}
