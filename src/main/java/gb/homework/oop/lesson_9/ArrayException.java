package gb.homework.oop.lesson_9;
/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
   При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
   Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ
   или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
   в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
   и MyArrayDataException и вывести результат расчета.
*/
public class ArrayException extends Exception {

    ArrayException(String message) {
        super(message);
    }
    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"Z", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Значение массива неверно");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }
}
