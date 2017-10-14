package mirea.isbo1016.mateyuk.lab2.book;

import java.util.Scanner;

public class bookTest {

    private static book WarAndPeace = new book("War & Peace", "Tolstoy", 1886, 75);
    private static book PowerOfFire = new book("Power of Fire", 1250, 200);
    private static book PowerofAir = new book("Power of Air", " Mage of Air");

    private static int counter;

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        library();
    }

    private static void library() {
        System.out.println("Our library: " + "\n");

        WarAndPeace.getBook();
        PowerOfFire.getBook();
        PowerofAir.getBook();

        System.out.println("\n" + "What book interesting for you? Input number: ");
        counter = in.nextInt();

        if (counter == 1) {
            WarAndPeace.getInfo();
           getBack();
        }
        else if (counter == 2)
        {
            PowerOfFire.getInfo();
            getBack();
        }
        else if (counter == 3)
        {
            PowerofAir.getInfo();
            getBack();
        }
    }

    private static void getBack()
    {
        System.out.println("\n" + "Do you want back to library? If yes input \"1\".");
        counter = in.nextInt();
        if (counter == 1)
            library();
    }
}
