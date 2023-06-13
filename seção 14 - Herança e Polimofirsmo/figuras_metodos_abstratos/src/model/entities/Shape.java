package model.entities;

import model.enums.Color;

public abstract class Shape {
    // ATRIBUTO
    private Color color;

    // construtores
    public Shape() {

    }
    public Shape(Color color) {
        this.color = color;
    }

    // getters e setters
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    // metodos

    public abstract double area();

    

    

}