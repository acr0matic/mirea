package mirea.isbo1016.mateyuk.lab3;

import mirea.isbo1016.mateyuk.lab3.task1.Dish;
import mirea.isbo1016.mateyuk.lab3.task1.Glass;
import mirea.isbo1016.mateyuk.lab3.task1.KKnife;
import mirea.isbo1016.mateyuk.lab3.task1.Spoon;
import mirea.isbo1016.mateyuk.lab3.task2.Dog;
import mirea.isbo1016.mateyuk.lab3.task2.Pitbull;
import mirea.isbo1016.mateyuk.lab3.task2.Pug;
import mirea.isbo1016.mateyuk.lab3.task3.Furniture;

public class Main {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[3];
        dogs[0] = new Pug(5, true);
        dogs[1] = new Pitbull(15, false);
        dogs[2] = new Pug(7,false);

        Dish[] dishes = new Dish[3];
        dishes[0] = new KKnife(true, 120);
        dishes[1] = new Glass(false,65);
        dishes[2] = new Spoon(false, 45);


        Furniture[] furnitures = new Furniture[3];


        for (Dog Dog : dogs) {
            System.out.println(Dog);
        }

        System.out.println("");
        for (Dish dish : dishes) {
            System.out.println(dish);
        }

        System.out.println("");
        for (Furniture furniture : furnitures) {
            System.out.println(furniture);

        }

    }
}
