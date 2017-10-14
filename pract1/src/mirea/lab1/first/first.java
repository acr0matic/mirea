package mirea.lab1.first;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input array size (2 - 5): ");
        int n = in.nextInt();
        while (n < 5 & n > 1) {

            int common = 0;
            int[] array = new int[n];

            for (int i = 0; i < array.length; i++) {
                do {
                    array[i] = in.nextInt();
                }
                while (array[i] < 0);
            }

            for (int i = 0; i < array.length; i++)
                common = common + array[i];

            System.out.println(common);
        }
        System.out.println("ERROR!");
    }
}
