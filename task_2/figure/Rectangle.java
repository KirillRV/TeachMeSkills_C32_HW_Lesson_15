package com.teachmeskills.lesson_15.task_2.figure;


public class Rectangle extends Figure {
    private final double height, width;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }
}