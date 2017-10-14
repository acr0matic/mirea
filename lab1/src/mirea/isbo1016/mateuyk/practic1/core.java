package mirea.isbo1016.mateuyk.practic1;

import java.util.Scanner;

public class core {


    public static void main(String[] args) {
        System.out.println("Enter number of example (1-2)   : ");

        Scanner input = new Scanner(System.in);
        int switchNum = input.nextInt();

        switch (switchNum)
        {
            case 1:
            {
                ball Footbool = new ball("White", 15);
                ball Basketbal = new ball("Orange", 20);
                ball Tennisball = new ball(5);

                Footbool.getInfo();
                Basketbal.getInfo();
                Tennisball.getInfo();
                 break;
            }
            case 2:
            {
                System.out.println("Available  books: " + " \n");
                book WarAndPeace = new book("War & Peace", 1820, 350);
                book MasterOfPuppets = new book("Master of Puppets");
                book Brief = new book("Brief", 1950, 120);

                WarAndPeace.getInfo();
                MasterOfPuppets.getInfo();
                Brief.getInfo();
                System.out.println(" \n" + "Name, Year, Price");

                System.out.println(" \n" + "You can change the price of a book with a title \"Brief\": ");
                Brief.setCost();
                Brief.getInfo();
               break;
            }
            default:
            {
                break;
            }
        }
    }
}
