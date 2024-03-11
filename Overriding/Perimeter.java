package com.Overriding;

class Shapes {
    public double perimeter() {
        return 0.0;
    }
}

class Rectangle extends Shapes {
     double length;
     double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Square extends Shapes {
     double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

class Circle extends Shapes {
     double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Perimeter {
    public static void main(String[] args) {
        double len = 2.5;
        double wgt = 2;
        double r = 2;

        Rectangle rectangle = new Rectangle(len, wgt);
        Square square = new Square(len);
        Circle circle = new Circle(r);

        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
        System.out.println("Perimeter of Square: " + square.perimeter());
        System.out.println("Perimeter of Circle: " + circle.perimeter());
    }
}
