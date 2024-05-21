package application;

import entities.Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2POO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Exercicio2 exercicio2 = new Exercicio2();

        System.out.println("------------------------------------------");
        System.out.println("Ficha do funcionario " );
        System.out.println("------------------------------------------");

        System.out.print("Name: ");
        exercicio2.name = sc.nextLine();
        System.out.print("Gross salary: ");
        exercicio2.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        exercicio2.tax = sc.nextDouble();

        System.out.println("------------------------------------------");
        System.out.println("Employee: " + exercicio2.toString());
        System.out.println("------------------------------------------");

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        exercicio2.increaseSalary(percentage);
        System.out.println("------------------------------------------");
        System.out.println("Updated data salary: " + exercicio2);
        System.out.println("------------------------------------------");

        sc.close();
    }
}
