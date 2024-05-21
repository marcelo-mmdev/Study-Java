package entities;

public class Exercicio2 {
    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary( double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() {
        return "Products: " +
                name + " - " +
                String.format("%.2f", netSalary());
    }
}
