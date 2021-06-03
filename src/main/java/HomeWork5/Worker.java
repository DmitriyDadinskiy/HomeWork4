package HomeWork5;

import java.util.StringJoiner;

public class Worker {

    //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

    private String name;
    private String position;
    private String email;
    private int phone;
    private int cash;
    private int age;

    //Конструктор класса должен заполнять эти поля при создании объекта.

    public Worker (String name, String position, String email, int phone,int cash, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.cash = cash;
        this.age= age;
    }

    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", cash=" + cash +
                ", age=" + age +
                '}';
    }

    public void print(){
    System.out.println(this);
}
    public int getAge (){
        return age;
    }
}
