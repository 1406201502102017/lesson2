package gb.homework.oop.lesson_7;

public class Plate extends MainClass {

    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        food -= n;
        if (food < 0) {
            System.out.println("The cat is hungry");
            food = 0;
        }
        return false;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
