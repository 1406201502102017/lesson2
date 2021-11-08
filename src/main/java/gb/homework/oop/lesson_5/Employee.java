package gb.homework.oop.lesson_5;

public class Employee {
    /*
    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    2. Конструктор класса должен заполнять эти поля при создании объекта.
    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    4. Создать массив из 5 сотрудников.
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
        30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);
    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     */

    String fullName;   //поля
    String position;
    String eMail;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fullName, String position, String eMail, String phoneNumber, int salary, int age) { //конструктор
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {

        employeeArr();

        Employee employee1 = new Employee("Ivan I. Petroff", "CEO", "I.Petroff_CEO@list.ru", "+7-524-568-12-45", 250000, 47);           //экземпляр класса Employee

        System.out.println(employee1 + "\n");              //вывод инфы об объекте в консоль
        System.out.printf("Сотрудник №1:\n \nФИО_________%s \nДолжность___%s \nе-почта_____%s \nТелефон_____%s \nЗарплата____%d \nВозраст_____%d",employee1.fullName,employee1.position,employee1.eMail,employee1.phoneNumber,employee1.salary,employee1.age);
        System.out.println();
    }

    public static void employeeArr() {

        Employee[] employee = new Employee[5];

        employee[0] = new Employee("Ivan I. Petroff", "CEO", "I.Petroff_CEO@list.ru", "+7-524-568-12-45", 250000, 47);
        employee[1] = new Employee("Sergey D. Sidorov", "Manager", "S.Sidorov_manag@mail.ru", "+7-984-238-17-21", 200000, 42);
        employee[2] = new Employee("John C. Smith", "Creator", "J.Smith_Cre@gmail.com", "+5-424-448-27-85", 235000, 34);
        employee[3] = new Employee("Vasya L. Ivanov", "Driver", "V.Ivanov_Driv@yandex.ru", "+7-224-478-56-01", 90000, 38);
        employee[4] = new Employee("Vika A. Kozlova", "Accauntant", "V.Kozlova_Acca@mail.ru", "+7-244-777-82-65", 150000, 30);

        for (int i = 0; i < 5; i++) {
            int age;
            if(int age > 40){
                System.out.println(employee[i].age);
            }
        }
    }
}
