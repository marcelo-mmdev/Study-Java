import java.util.Scanner;

public class FuncaoStudy {
    public static void main(String[] args){
        // Principais vantagens da função: Modularização, delegação e reaproveitamento

        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Qual o numero maior dos tres ");
        System.out.println("---------------------------------------");
        System.out.println("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        if( a > b && a > c ){
//            System.out.println("Esse e o maoir numero: " + a);
//        } else if ( b > c) {
//            System.out.println("Segundo numero é Maior: " + b);
//        } else {
//            System.out.println("Terceiro numero e o maior: " + c);
//        }

        int higher = max(a, b, c);
        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if( x > y && x > z){
            aux = x;
        } else if ( y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }

}
