package AQAston.Lesson_5.Animals;

public class Dog extends Animal{

    public static int count;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
