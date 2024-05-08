import java.util.Scanner;

public class WhileStudy {
    public static void main(String[] args) {
        System.out.println("Study is While");
        System.out.println("--------------------------------------------");
        System.out.println("Recomenda quando não se sabe previamente");
        System.out.println("a quantidade de repetições");
        System.out.println("--------------------------------------------");

        System.out.println("----------- Inicio --------------------");
        System.out.println("Digite um numero para o contador");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite mais um numero");
            int x = sc.nextInt();
            soma = soma + x;

        }

        System.out.println("Soma de todos os numeros digitados: " + soma);

        System.out.println("--------------------------------------------");
        for(int e=5; e>=0; e--) {
            System.out.println("For decremento com vamlor de e: " + e);
        }

        System.out.println("------------- Fim ---------------------");
        sc.close();
    }
}
