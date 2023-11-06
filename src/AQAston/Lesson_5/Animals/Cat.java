package AQAston.Lesson_5.Animals;

public class Cat extends Animal {

    public static int count;
    boolean satiety;
    int appetite;



    public Cat(String name,int maxRunDistance) {
        super(name, maxRunDistance, 0);
        count++;
    }


    public Cat(String name, boolean satiety, int appetite) {
        super(name, 0, 0);
        this.satiety = satiety;
        this.appetite = appetite;
    }

}
