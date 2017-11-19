package mirea.isbo1016.mateyuk.lab7;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> digitsList = new ArrayList<>();

        for (int i = 40; i < 50; i++) {
            digitsList.add(i);
        }

        System.out.println("8-ой Элемент списка: " + digitsList.get(8));

        System.out.println("Весь список: ");
        for (Integer integer : digitsList)
            System.out.print(integer + " ");

        digitsList.remove(5);
        System.out.println("\nУдален 5-ый элемент списка. \nНовый список: ");

        for (Integer integer : digitsList)
            System.out.print(integer + " ");

    }
}
