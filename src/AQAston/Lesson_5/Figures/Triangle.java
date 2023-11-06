package AQAston.Lesson_5.Figures;

public class Triangle extends Figures implements Parametrs {

    double a;
    double b;
    double c;

    public Triangle(String fillColor, String borderColor, double a, double b, double c) {
        super(fillColor, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        return getPerimeter()/2;
    }
}
