package gb.homework.oop.lesson_6;

public class Cat extends Animal {
//    private String name;
//    private String notSwim;
//    private int distanceRun;

    public Cat(String name, String notSwim, int distanceRun) {
        this.name = name;
        this.notSwim = notSwim;
        this.distanceRun = distanceRun;
    }
    public void run() {
        System.out.println("Cat " + name + " is runs " + distanceRun + " meters");
    }
    public void swim() {
        System.out.println("Cat " + name + notSwim);
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getDistanceRun() {
//        return distanceRun;
//    }
//
//    public void setDistanceRun(int distanceRun) {
//        this.distanceRun = distanceRun;
//    }
//
//    public String getNotSwim() {
//        return notSwim;
//    }
//
//    public void setNotSwim(String notSwim) {
//        this.notSwim = notSwim;
//    }
}