package Lesson6;

public class Main {
    public static void main(String[] args) {


        Animal[] animals = new Animal[7];
        for (int i = 0; i < animals.length; i++){
            if(i<animals.length/2){
                animals[i] = new Cat();
            } else {
                animals[i] = new Dog();
            }
        }
        for (Animal animal : animals){
            animal.run(100);
            animal.jump(1.9);
            animal.swim(5);

        }

    }
}
