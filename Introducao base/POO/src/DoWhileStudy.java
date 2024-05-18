import java.util.Locale;
import java.util.Scanner;

public class DoWhileStudy {
    public static void main(String[] args) {
        System.out.println("Study is Do While");
        System.out.println("--------------------------------------------");
        System.out.println("O bloco de comandos executa pelo menos");
        System.out.println("uma vez, pois a condição é verificada no final");
        System.out.println("--------------------------------------------");

        System.out.println("----------- Inicio --------------------");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Jeito feio de fazer
//
//        System.out.println("Digite a temperatura em Celsius: ");
//        double C = sc.nextDouble();
//        double F = 9.0 * C / 5.0 + 32.0;
//        System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
//        System.out.print("Deseja repetir (s/n)? ");
//        char resp = sc.next().charAt(0);
//
//
//        while (resp != 'n') {
//            System.out.println("Digite a temperatura em Celsius: ");
//            C = sc.nextDouble();
//            F = 9.0 * C / 5.0 + 32.0;
//            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
//            System.out.print("Deseja repetir (s/n)? ");
//            resp = sc.next().charAt(0);
//        }


//          Gambiarra
//
//        char resp = 's';
//
//        while (resp != 'n') {
//            System.out.println("Digite a temperatura em Celsius: ");
//            double C = sc.nextDouble();
//            double F = 9.0 * C / 5.0 + 32.0;
//            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
//            System.out.print("Deseja repetir (s/n)? ");
//            resp = sc.next().charAt(0);
//        }



        char resp;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        System.out.println("------------- Fim ---------------------");
        sc.close();
    }
}
