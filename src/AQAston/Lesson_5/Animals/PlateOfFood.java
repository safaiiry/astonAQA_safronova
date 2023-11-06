package AQAston.Lesson_5.Animals;

public class PlateOfFood {

    int food;

    public PlateOfFood(int food) {
        this.food = food;
    }


    public void addFoodInPlant(int food) {
        this.food += food;
    }


    public void status() {
        System.out.println("В тарелке " + food + " еды");
    }
}
