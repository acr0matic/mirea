package mirea.lab1.fourth;

import java.util.Scanner;

public class fourth {

    private static void searchFact(int digit)
    {
        int result = 1;
        for(int i = 1; i < digit; i++)
        {
            result *= i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fact;

        System.out.println("Введите число для поиска его факториала: ");
        fact = in.nextInt() + 1;
        searchFact(fact);
    }
}
