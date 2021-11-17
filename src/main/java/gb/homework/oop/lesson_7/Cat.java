package gb.homework.oop.lesson_7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            System.out.println();
            satiety = true;
        } System.out.println("The cat " + name + " is happy");
        //p.decreaseFood(appetite);
    }
}
