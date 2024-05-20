package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class TrianglePOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("------------ OK --------------------");
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        System.out.println("------------------------------------");

        double areaX = x.area();

        double areaY = x.area();

        System.out.println("------------------------------------");
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.println("------------------------------------");
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        System.out.println("------------------------------------");

        if( areaX > areaY){
            System.out.println("------------------------------------");
            System.out.println("Larger area: X");
            System.out.println("------------------------------------");

        } else {
            System.out.println("------------------------------------");
            System.out.println("Larger area: Y");
            System.out.println("------------------------------------");
        }
        sc.close();

    }
}
