package model.entities;

import model.enums.Color;

public final class Rectangle extends Shape{
    // atributos
    private double width;
    private double height;

    // construtores
    public Rectangle() {
        super();
    }

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // getters e setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }

    

    
}
