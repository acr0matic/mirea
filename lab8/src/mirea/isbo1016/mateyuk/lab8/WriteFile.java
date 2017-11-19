package mirea.isbo1016.mateyuk.lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {

        System.out.println("Введите текст для записи: ");
        Scanner input = new Scanner(System.in);

        try
        {
            FileWriter writer = new FileWriter("C:/examplefile.txt", false);
            writer.write(input.nextLine());
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
