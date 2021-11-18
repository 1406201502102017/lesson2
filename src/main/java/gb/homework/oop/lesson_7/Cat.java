package gb.homework.oop.lesson_7;

public class Cat extends MainClass {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            System.out.println("The cat " + name + " is happy");
            satiety = true;
        }
        //p.decreaseFood(appetite);
    }
    public String toString() {
        return name + " " + appetite + " " + satiety;
    }
}

