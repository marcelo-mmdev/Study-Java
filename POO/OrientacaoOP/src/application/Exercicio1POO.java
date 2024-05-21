package application;

import entities.Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1POO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Exercicio1 exercicio1 = new Exercicio1();

        System.out.println("------------------------------------------");
        System.out.println("TRIANGLE - Area, Perimeter, Diagonal");
        System.out.println("------------------------------------------");

        System.out.print("Enter Width in triangle: ");
        exercicio1.width = sc.nextDouble();
        System.out.print("Enter Height in triangle: ");
        exercicio1.height = sc.nextDouble();

        System.out.println("------------------------------------------");
        System.out.println("Area: " + exercicio1.area());

        System.out.println("------------------------------------------");
        System.out.println("Perimeter: " + exercicio1.perimeter());

        System.out.println("------------------------------------------");
        System.out.println("Diagonal: " + exercicio1.diagonal());
        System.out.println("------------------------------------------");

        sc.close();
    }
}
