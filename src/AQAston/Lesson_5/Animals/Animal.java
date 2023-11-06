package AQAston.Lesson_5.Animals;

public abstract class Animal {

    public static int count;

    String name;
    int maxRunDistance;
    int maxSwimDistance;


    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }


    public void run(int distance) {
        if (distance <= 0) {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        }
        else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        }
        else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }


    public void eat(PlateOfFood plate, int food) {
        plate.food -= food;
    }
}
