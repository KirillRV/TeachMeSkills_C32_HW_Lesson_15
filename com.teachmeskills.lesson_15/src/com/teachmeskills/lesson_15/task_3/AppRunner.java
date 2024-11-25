package com.teachmeskills.lesson_15.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Task 3
Create a collection of integers.
Fill the collection with random numbers.
Let the collection size be specified from the console.
Provide a check for validity of the entered collection size.
Calculate and display the arithmetic mean of all elements of the collection.
 */
public class AppRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Your size number: ");
            int number = scanner.nextInt();
            List<Integer> list = new ArrayList<>(number);
            for (int i = 0; i < number; i++) {
                int random = (int) (Math.random() * 101);
                list.add(random);
            }
            System.out.println("Random values: " + list);

            double sum = 0;
            for (Integer listNumber : list) {
                sum += listNumber;
            }
            double average = sum / list.size();
            System.out.println("Arithmetic mean: " + average);

        } catch (Exception e) {
            System.out.println("Invalid size,try another");
        }
    }
}