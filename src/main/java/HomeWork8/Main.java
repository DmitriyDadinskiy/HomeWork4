package HomeWork8;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();
       Treadmill treadmill = new Treadmill(10);
         Wall wall = new Wall();
        System.out.println(wall.maxHeight + " высота стены");
//Создайте два класса: беговая дорожка и стена, при прохождении через которые,
        // участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
    if(human.jumpMax >=  wall.getMaxHeight()){
    human.jump();
    } else {
    System.out.println("Человек не может так прыгать");
}
    if(cat.jumpMax >= wall.getMaxHeight()){
        cat.jump();
    } else {
        System.out.println("Кот не смог перепрыгнуть, так как прыгнул всего на " + cat.jumpMax);
    }
    if(robot.jumpMax >= wall.getMaxHeight()) {
        robot.jump();
    } else {
        System.out.println("Робот не смогу перепрыгнуть, так как прыгнул всего на " + robot.jumpMax);
    }
        System.out.println("");
        System.out.println("Беговая дорожка раскрутилась до скорость " + treadmill.getMaxSpeed());

    if(human.runMaxSpeed >= treadmill.getMaxSpeed()){
        human.run();
    } else {
        System.out.println("Человек бежит медленней дорожки на " + (treadmill.getMaxSpeed() - human.runMaxSpeed) + " и не смог устоять");
    }
    if(cat.runMaxSpeed >= treadmill.getMaxSpeed()) {
        cat.run();
    } else {
        System.out.println("Кот бежит медленней дорожки на " + (treadmill.getMaxSpeed() - cat.runMaxSpeed) + " и не смог устоять");
    }
    if (robot.runMaxSpeed >= treadmill.getMaxSpeed()) {
        robot.run();
    } else {
        System.out.println("Робот не смог пробежать");
    }

        System.out.println("");

    }
  //  Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.


}

