package AQAston.Lesson_5.Figures;

public class App {
    public static void main(String[] args) {
        forCircle();
        forRectangle();
        forTriangle();
    }

    public static void forCircle() {
        Circle circle = new Circle("yellow", "black", 3);
        System.out.println("Circle fill color: " + circle.fillColor);
        System.out.println("Circle border color: " + circle.borderColor);
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("___________________________________________");
    }


    public static void forRectangle() {
        Rectangle rectangle = new Rectangle("purple", "black", 10, 16);
        System.out.println("Rectange fill color: " + rectangle.fillColor);
        System.out.println("Rectangle border color: " + rectangle.borderColor);
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("___________________________________________");
    }


    public static void forTriangle() {
        Triangle triangle = new Triangle("blue", "white", 6, 6, 6);
        System.out.println("Triangle fill color: " + triangle.fillColor);
        System.out.println("Triangle border color: " + triangle.borderColor);
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("___________________________________________");
    }
}
