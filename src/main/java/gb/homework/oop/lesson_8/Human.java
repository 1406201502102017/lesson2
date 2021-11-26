package gb.homework.oop.lesson_8;

/*  1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
       Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
    2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
       участники должны выполнять соответствующие действия (бежать или прыгать),
       результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
    3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
    4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
    Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
*/
public class Human {

    private static String name;
    private static int run;
    private static int jump;

    public Human(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }
    public String getName() {
        return this.name;
    }
    public static void run() {
         Human human = new Human("Jimmy", 1000, 70);
        System.out.print("A man named " + name + " runs " + run + " meters");
    }
    public boolean run(int distance) {
        return this.run >= distance;
    }
    public static void jump() {
        Human human = new Human("Jimmy", 1000, 30);
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

