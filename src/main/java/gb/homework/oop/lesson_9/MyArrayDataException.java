package gb.homework.oop.lesson_9;

public class MyArrayDataException extends ArrayException {

    public String i;
    public String j;

    MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные находятся в ячейке [%d, %d]\n", row, col));
    }
}
