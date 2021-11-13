package gb.homework.oop.lesson_6;

public class Animal {
    protected String name;
    protected int distanceRun;
    protected int distanceSwim;
    private static int count = 0;

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
    public Animal() {
         count++;
    }
    public static int getCount() {
        return count;
    }
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 30, 100);
        Dog dog = new Dog("Sharik", 10, 300);
        int counter = Animal.getCount();

        cat.swim();
        cat.run();
        dog.swim();
        dog.run();

    System.out.println("Cats: " + Cat.getCount() + "\nDogs: " + Dog.getCount());
    //System.out.println("Dogs: " + Dog.getCount());
    }
}
