package mirea.isbo1016.mateyuk.lab3;

import mirea.isbo1016.mateyuk.lab3.task2.Dog;
import mirea.isbo1016.mateyuk.lab3.task2.Pitbull;
import mirea.isbo1016.mateyuk.lab3.task2.Pug;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Pug(5, true);
        dogs[1] = new Pitbull(15, false);

        for (Dog Dog : dogs) {
            System.out.println(Dog);
        }

    }
}
