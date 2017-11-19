package mirea.isbo1016.mateyuk.lab8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        try
        {
            FileReader fileReader = new FileReader("C:/examplefile.txt");
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine())
                System.out.println("Выведенный текст: \n" + scanner.nextLine());
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }
}
