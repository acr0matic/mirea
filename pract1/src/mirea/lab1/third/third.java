package mirea.lab1.third;

import java.util.Random;

public class third {

    private  static  void Swap(int[] massive,  int LeftIndex, int RightIndex)
    {
        massive[LeftIndex] ^= massive[RightIndex];
        massive[RightIndex] ^= massive[LeftIndex];
        massive[LeftIndex] ^= massive[RightIndex];
    }

    private static void Sort(int[] massive)
    {
        for (int i = 0; i < massive.length - 1; i++)
            for (int j = 0; j <massive.length - i - 1; j++)
            {
                if (massive[j] > massive[j+1])
                {
                    Swap(massive, j, j+1);
                }
            }
    }
    public static void main(String[] args)

    {
        Random rnd = new Random();
        int Lenght = 4 + rnd.nextInt(9 - 4);
        int[] mass = new int[Lenght];

        System.out.println("\n" + "Неотсортированный массив"+ "\n");

        for(int i=0; i < mass.length; i++)
        {
            mass[i]= 1 + rnd.nextInt(25 - 1);
            System.out.println(mass[i]);
        }

        System.out.println("\n" + "Отсортированный массив"+ "\n");

        Sort(mass);

        for(int i=0; i < mass.length; i++)
        {
            System.out.println(mass[i]);
        }
    }
}
