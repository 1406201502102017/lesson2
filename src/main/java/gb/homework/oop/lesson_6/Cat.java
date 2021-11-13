package gb.homework.oop.lesson_6;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому
методу передается длина препятствия. Результатом выполнения действия
будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
 */

public class Cat extends Animal {

    public Cat(String name, int distanceSwim, int distanceRun) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
    }
    public void run() {
        if (distanceRun <= 200 && distanceRun > 0) {
            System.out.println("Cat " + name + " was runs " + distanceRun + " meters");
        } else {
            System.out.println("Cat " + name + " is too tyred");
        }
    }
    public void swim() {
        if (distanceSwim >= 0 || distanceSwim <= 0) {
            System.out.println("Cat " + name + " is can't swims!");
        }
    }
}

