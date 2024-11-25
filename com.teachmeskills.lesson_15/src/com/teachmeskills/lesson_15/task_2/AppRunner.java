package com.teachmeskills.lesson_15.task_2;
import com.teachmeskills.lesson_15.task_2.figureList.FigureList;
import com.teachmeskills.lesson_15.task_2.figure.Figure;
import com.teachmeskills.lesson_15.task_2.figure.Rectangle;
import com.teachmeskills.lesson_15.task_2.figure.Circle;
import com.teachmeskills.lesson_15.task_2.figure.Triangle;

import java.util.ArrayList;
import java.util.List;
/*
Task 2
Create a collection of shapes.
(take the classes for shapes from previous homework)
Fill the collection with different shapes.
Loop through the collection and call a method to calculate and display the perimeter of each shape.
 */
public class AppRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(9);
        Triangle triangle = new Triangle(5, 10, 15);
        Rectangle rectangle = new Rectangle(5, 8);
        List<Figure> figureList = new ArrayList<>();
        figureList.add(circle);
        figureList.add(rectangle);
        figureList.add(triangle);
        FigureList.showPerimeter(figureList);

    }
}
