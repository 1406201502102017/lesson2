package gb.homework.oop.lesson_8;

public class Robot {

    private static String model;
    private static int run;
    private static int jump;

    public Robot(String model, int run, int
            jump) {
        this.model = model;
        this.run = run;
        this.jump = jump;
    }
    public String getName() {
        return this.model;
    }
    public static void run() {
        Robot robot = new Robot("XZ-57", 10000, 170);
        System.out.print("A robot model " + model + " runs " + run + " meters");
    }
    public boolean run(int distance) {
        return this.run >= distance;
    }
    public static void jump() {
        Robot robot = new Robot("XZ-57", 10000, 170);
        System.out.print(" and jumps up " + jump + " centimeters");
    }
    public boolean jump(int height) {
        return this.jump >= height;
    }
    public static void main(String[] args) {
        run();
        jump();
    }
}
