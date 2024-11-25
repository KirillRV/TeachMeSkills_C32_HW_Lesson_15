package com.teachmeskills.lesson_15.task_2.FigureList;

import com.teachmeskills.lesson_15.task_2.figure.Figure;

import java.util.List;

public class FigureList {
    public static void showPerimeter(List<Figure> figures) {
        for (Figure figure : figures) {
            System.out.printf("Name Figure: %s, Perimeter: %.2f\n", figure.name(), figure.perimeter());
        }
    }
}