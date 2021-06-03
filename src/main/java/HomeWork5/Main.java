package HomeWork5;

public class Main {
    //Создать массив из 5 сотрудников. Пример: Person[] persArray = new Person[5];
    // Вначале объявляем массив объектов persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    // потом для каждой ячейки массива задаем объект persArray[1] = new Person(...); ... persArray[4] = new Person(...);

    public static void main(String[] args) {

        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Papikov Vpl", "Manager", "email@1", 99999999, 100, 41);
        workArray[1] = new Worker("Mamikov Mam", "secretary", "email@2", 88888888, 50, 51);
        workArray[2] = new Worker("Karkov Dim", "engineer", "email@3", 7777777, 95, 42);
        workArray[3] = new Worker("Smorin Ra", "locksmith", "email@4", 666666666, 70, 43);
        workArray[2] = new Worker("Posledniy Paren", "trainee", "email@5", 555555555, 21, 54);


        //С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

       for (int i = 0; i < workArray.length; i++){
           if (workArray[i].getAge() >= 40) {
               workArray[i].print();
           }
       }
    }
}

