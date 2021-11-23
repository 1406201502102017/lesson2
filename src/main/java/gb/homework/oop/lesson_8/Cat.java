package gb.homework.oop.lesson_8;

public class Cat implements Competitors {
    private static String name;
    private static int run;
    private static int jump;

    public Cat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }
    //@Override
    public String getName() {
        return this.name;
    }
    public static void run() {
        Cat cat = new Cat("Tom", 100, 20);
        System.out.print("A cat named " + name + " runs " + run + " meters");
    }
    //@Override
    public boolean run(int distance) {
        return this.run >= distance;
    }
    public static void jump() {
        Cat cat = new Cat("Tom", 100, 20);
        System.out.print(" and jumps up " + jump + " centimeters");
    }
    //@Override
    public boolean jump(int height) {
        return this.jump >= height;
    }
    public static void main(String[] args) {
        run();
        jump();
    }
}
