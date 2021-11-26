package gb.homework.oop.lesson_6;

public class Dog extends Animal {

    public Dog(String name, int distanceSwim, int distanceRun) {
        this.name = name;
        this.distanceSwim = distanceSwim;
        this.distanceRun = distanceRun;
    }
    public void run() {
        if (distanceRun <= 500 && distanceRun > 0) {
            System.out.println("Dog " + name + " was run " + distanceRun + " meters");
        } else {
            System.out.println("Dog " + name + " is too tyred");
        }
    }
    public void swim() {
        if (distanceSwim <= 10 && distanceSwim > 0) {
            System.out.println("Dog " + name + " was swim " + distanceSwim + " meters");
        } else {
            System.out.println("Dog " + name + " is too tyred");
        }
    }
}

