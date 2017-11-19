package mirea.isbo1016.mateyuk.lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class AddInFile {
    public static void main(String[] args) throws Exception{
        System.out.println("Текущая информация в файле: ");
        FileReader fileReader = new FileReader("C:/examplefile.txt");
        Scanner fileScanner = new Scanner(fileReader);
        while (fileScanner.hasNextLine())
            System.out.println(fileScanner.nextLine());
        fileReader.close();

        System.out.println("Введите новую информацию: ");
        FileWriter fileWriter = new FileWriter("C:/examplefile.txt", true);
        Scanner input = new Scanner(System.in);
        fileWriter.write(" " + input.nextLine());
        fileWriter.close();

        System.out.println("Запись произведенна успешна!");

    }
}
