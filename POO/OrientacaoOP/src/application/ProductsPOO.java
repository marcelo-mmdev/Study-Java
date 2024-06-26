package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class ProductsPOO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products products = new Products();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        products.name = sc.nextLine();
        System.out.print("Price: ");
        products.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        products.quantity = sc.nextInt();

        System.out.println("------------------------------------------");
        System.out.println("Product data: " + products);
        System.out.println("------------------------------------------");

        System.out.print("Update data: ");
        int quantity = sc.nextInt();
        products.addProducts(quantity);

        System.out.println("------------------------------------------");
        System.out.println("Updated data: " + products);
        System.out.println("------------------------------------------");


        System.out.print("Remove data: ");
        quantity = sc.nextInt();
        products.removeProducts(quantity);

        System.out.println("------------------------------------------");
        System.out.println("Remove data: " + products);
        System.out.println("------------------------------------------");

        sc.close();
    }
}
