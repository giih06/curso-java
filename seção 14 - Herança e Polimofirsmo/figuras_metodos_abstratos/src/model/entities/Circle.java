package model.entities;

import model.enums.Color;

public final class Circle extends Shape{
    
    // atributos
    private Double radius;

    // construtores
    public Circle() {
        super();
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }  

    // getters e setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    
}
