package gb.homework.oop.lesson_9;

public class MyArraySizeException extends ArrayException {

    MyArraySizeException() {
        super("Размерность массива должна быть [4 x 4]\n");
    }
}
