package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }
    public void addEat(int x){
        food += x;
    }
    public void info(){ //2 Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
       if (food < 0) {
           System.out.println("plate: " + 0);
        } else {
           System.out.println("plate: " + food);
       }
    }

    public int getFood() {
        return food;
    }
}


