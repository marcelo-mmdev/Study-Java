package entities;

public class Exercicio1 {
    public double width;
    public double height;

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return (height + width) * 2;
    }

    public double diagonal() {
        return Math.sqrt(height * height + width * width);
    }

}
