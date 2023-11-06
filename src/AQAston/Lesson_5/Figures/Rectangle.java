package AQAston.Lesson_5.Figures;

public class Rectangle extends Figures implements Parametrs {
    double width;
    double length;

    public Rectangle(String fillColor, String borderColor, double length, double width) {
        super(fillColor, borderColor);
        this.length = length;
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
