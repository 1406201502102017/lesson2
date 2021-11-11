package gb.homework.oop.lesson_6;

public class Dog extends Animal {
//    private String name;
//    private int distanceSwim;
//    private int distanceRun;

    public Dog(String name, int distanceSwim, int distanceRun) {
        this.name = name;
        this.distanceSwim = distanceSwim;
        this.distanceRun = distanceRun;
    }
    public void run() {
        System.out.println("Dog " + name + " is runs " + distanceRun + " meters");
    }
    public void swim() {
        System.out.println("Dog " + name + " is swims " + distanceSwim + " meters");
    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getDistanceRun() {
//        return distanceRun;
//    }
//    public void setDistanceRun(int distanceRun) {
//        this.distanceRun = distanceRun;
//    }
//    public int getDistanceSwim() {
//        return distanceSwim;
//    }
//    public void setDistanceSwim(int distanceSwim) {
//        this.distanceSwim = distanceSwim;
//    }
}
