package HomeWork11;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

public class MainBox {

    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        appleBox.addFruits(new Apple(1), 100);
        appleBox1.addFruits(new Apple(1),100);
        orangeBox.addFruits(new Orange(1),10);
        orangeBox1.addFruits(new Orange(1), 50);
       // orangeBox2.addFruits(new Orange(0));
        appleBox.addFruits(new Apple(1), new Apple(1));


        System.out.println("orangeBox " + orangeBox.getWeight() + " appleBox " + appleBox.getWeight());
        System.out.println("orangeBox1  " + orangeBox1.getWeight());
        System.out.println(" orangeBox2 " + orangeBox2.getWeight());

        System.out.println(" orangeBox vs orangeBox2 " + orangeBox.compare(orangeBox2));
        System.out.println(" appleBox vs appleBox2 " + appleBox.compare(appleBox1));
        orangeBox.replaceAllIn(orangeBox2);

        System.out.println("orangeBox = " + orangeBox.getWeight());
        System.out.println("orangeBox2 = " + orangeBox2.getWeight());

    }
}
