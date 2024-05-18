import java.util.Scanner;

public class StringStudy {
    public static void main(String[] args) {
        /*

            Formatar: toLowerCase(Minusculo), toUpperCase(maiusculos), trim(remove espaços)
            Recortar: substring(inicio), substring(inicio, fim)
            Substituir: Replace(char, char), Replace(string, string)
            Buscar possição: IndexOf, LastIndexOf
            Recortar string com base do separador indicado: str.Split("")

        */ 

        String original = "abcd FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace("a", "x");
        String s07 = original.replace("abc", "XYY");
        int i = original.indexOf("bc");
        int y = original.lastIndexOf("bc");

        String s = "potato apple lemon orange";
        String[] vect = s.split(" ");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace(a, x): -" + s06 + "-");
        System.out.println("replace(abc, xyy): -" + s07 + "-");
        System.out.println("IndexOf bc: -" + i + "-");
        System.out.println("LastOf bc: -" + y + "-");

        System.out.println("-------------- VECT ---------------");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
        System.out.println("-----------------------------------");


    }
}
