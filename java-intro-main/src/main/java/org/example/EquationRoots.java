package org.example;

import java.util.Scanner;

public class EquationRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите аргумент a:");
        double numberA = scanner.nextDouble();
        System.out.println("Введите аргумент b:");
        double numberB = scanner.nextDouble();
        System.out.println("Введите аргумент c:");
        double numberC = scanner.nextDouble();

        double[] roots = findRoots(numberA, numberB, numberC);
        printResult(roots);

        scanner.close();
    }

    public static double[] findRoots(double numberA, double numberB, double numberC) {
        double discriminant = numberB * numberB - 4 * numberA * numberC;
        if (discriminant > 0) {
            double numberX1 = (-numberB + Math.sqrt(discriminant)) / (2 * numberA);
            double numberX2 = (-numberB - Math.sqrt(discriminant)) / (2 * numberA);
            return new double[] {numberX1, numberX2};
        } else if (discriminant == 0) {
            double numberX1 = -numberB / (2 * numberA);
            return new double[] {numberX1};
        } else {
            return new double[0]; // Нет вещественных корней
        }
    }

    public static void printResult(double[] roots) {
        if (roots.length == 2) {
            System.out.println("Корни уравнения: x1=" + roots[0] + " x2=" + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Корень уравнения: x1=" + roots[0]);
        } else {
            System.out.println("Нет вещественных корней");
        }
    }
}