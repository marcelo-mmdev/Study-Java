package entities;

public class Exercicio3 {
    public String name;
    public double n1, n2, n3;

    public double result() {
        return n1 + n2 + n3;
    }

    public double pontos() {
        if(result() < 60.0) {
            return 60.0 - result() + 1;
        } else {
            return result();
        }
    }
}
