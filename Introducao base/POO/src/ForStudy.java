import java.util.Scanner;

public class ForStudy {
    public static void main(String[] args) {
        System.out.println("Study is For");
        System.out.println("--------------------------------------------");
        System.out.println("Quando se sabe previamente");
        System.out.println("a quantidade de repetições");
        System.out.println("ou intervalo de valores");
        System.out.println("--------------------------------------------");

        System.out.println("----------- Inicio --------------------");
        System.out.println("Digite varios numeros ou 0 para fecha o programa");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while ( x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println("Soma de todos os numeros digitados: " + soma);

        System.out.println("------------- Fim ---------------------");
        sc.close();
    }
}
