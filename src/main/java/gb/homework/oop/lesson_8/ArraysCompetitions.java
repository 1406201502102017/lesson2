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

        for (int i = 0; i < competitors.length; i++) {
            for (int j = 0; j < equipment.length; j++) {
                if (competitors[i] > equipment[j]) {
                    System.out.print(competitors);
                }
                else {
                    break;
                }
            }
        }
    }
}
