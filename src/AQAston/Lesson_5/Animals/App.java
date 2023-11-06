package AQAston.Lesson_5.Animals;

public class App {
    public static void main(String[] args) {
        animals();
        feedCats();
    }


    public static void animals() {
        Animal[] animals =
                {
                        new Cat("Оскар", 300),
                        new Dog("Риф", 550, 12)
                };

        for (Animal animal : animals) {
            animal.run(400);
            animal.swim(200);
        }

        System.out.println("Общее количество животных: " + Animal.count);
        System.out.println("Общее количество котов " + Cat.count);
        System.out.println("Общее количество собак " + Dog.count);
    }


    public static void feedCats() {
        Cat[] cats = {
                new Cat("Барсик", false, 10),
                new Cat("Рональд", false, 13),
                new Cat("Эклерчик", false, 17)
        };

        PlateOfFood plateOfFood = new PlateOfFood(35);

        for (Cat cat : cats) {
            if (plateOfFood.food >= cat.appetite) {
                cat.eat(plateOfFood, cat.appetite);
                cat.satiety = true;
            }

            if (cat.satiety) {
                System.out.println(cat.name + " сыт!");
            }
            else {
                System.out.println(cat.name + " не сыт :(");
            }

            plateOfFood.status();
        }

    }
}
