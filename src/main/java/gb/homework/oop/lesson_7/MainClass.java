package gb.homework.oop.lesson_7;
/*
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного
количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой
тарелки и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

import java.util.Arrays;

public class MainClass {

    private int appetite;
    private int food;

    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public static void main(String[] args) {

        Plate plate = new Plate(150);
        Cat cat = new Cat("Bazilio", 21);

        plate.info();
        cat.eat(plate);
        plate.info();
        System.out.println();
        //plate.setFood(plate.getFood() - cat.getAppetite());

        Cat[] cats = { new Cat("Bazilio", 151),
                       new Cat("Tom", 49),
                       new Cat("Markiz", 5),
                       new Cat("Jerry", 101)};

            for (int i = 0; i < cats.length; i++) {
                cat.eat(plate);

                System.out.println(cats);
                System.out.println(cats.toString());
        }
    }
}
