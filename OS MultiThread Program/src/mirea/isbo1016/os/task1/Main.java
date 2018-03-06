package mirea.isbo1016.os.task1;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startThreads(); // вынес отдельным методом, чтобы можно было повторно вызывать
    }

    private static void startThreads(){

        Random randomGen = new Random();
        Scanner keyInput = new Scanner(System.in);

        SetThread[] threads = new SetThread[5]; //создаем массив из объектов "потоков"
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new SetThread(randomGen.nextInt(randomGen.nextInt(10000)), i+1); //Создаем поток с уникальными параметрами
            threads[i].pushThread(); //Запускаем поток
        }

        for (int i = 0; i < threads.length; i++)
            while (threads[i].checkThread()) {} //данный кусок делает проверку на то что все потоки завершились

        System.out.println("Все потоки завершены.");
        System.out.println("Повторить y/n");

        String input = keyInput.nextLine();
        if ("y".equals(input))
            startThreads();
    }
}
