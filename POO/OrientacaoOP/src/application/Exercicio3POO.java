package application;

import entities.Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3POO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Exercicio3 exercicio3 = new Exercicio3();

        System.out.println("------------------------------------------");
        System.out.println("Boletim de notas" );
        System.out.println("------------------------------------------");

        System.out.print("Name: ");
        exercicio3.name = sc.nextLine();
        System.out.print("Nota 1: ");
        exercicio3.n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        exercicio3.n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        exercicio3.n3 = sc.nextDouble();

        System.out.println("------------------------------------------");
        System.out.println("Final grade: " + exercicio3.result());
        System.out.println("------------------------------------------");

        if (exercicio3.pontos() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", exercicio3.pontos());
        }
        else {
            System.out.println("PASS");
        }

//        System.out.print("Which percentage to increase salary? ");
//        double percentage = sc.nextDouble();
//        exercicio2.increaseSalary(percentage);
//        System.out.println("------------------------------------------");
//        System.out.println("Updated data salary: " + exercicio2);
//        System.out.println("------------------------------------------");

        sc.close();
    }
}
