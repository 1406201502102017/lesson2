package gb.homework.oop.lesson_8;

public class ArraysCompetitions {

    public static void main(String[] args) {

        Competitors[] competitors = {
                new Human("Jimmy", 1000, 70),
                new Cat("Tom", 100, 20),
                new Robot("XZ-57", 10000, 170)};

        Equipment[] equipment = {
                new Treadmill(1523),
                new Wall(48)};

        for (Competitors c : competitors) {
            for (Equipment e : equipment) {
                if (c < e) {
                    break;
                    System.out.print(human.name + cat.name + robot.name);
                }
                else {
                    System.out.print("give up");
                }
            }
        }
    }
}
