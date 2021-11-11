package gb.homework.oop.lesson_6;

//import.
//import.

public class Animal {
    protected String name;
    protected String notSwim;
    protected int distanceRun;
    protected int distanceSwim;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDistanceRun() {
        return distanceRun;
    }
    public void setDistanceRun(int distanceRun) {
        this.distanceRun = distanceRun;
    }
    public int getDistanceSwim() {
        return distanceSwim;
    }
    public void setDistanceSwim(int distanceSwim) {
        this.distanceSwim = distanceSwim;
    }
    public String getNotSwim() {
        return notSwim;
    }
    public void setNotSwim(String notSwim) {
        this.notSwim = notSwim;
    }

//    public static void main(String[] args) {
//        Cat cat = new Cat("Murzik", " is can't swims", 150);
//        Dog dog = new Dog("Sharik", 100, 200);
//
//        cat.swim();
//        cat.run();
//        dog.swim();
//        dog.run();
//    }
}
