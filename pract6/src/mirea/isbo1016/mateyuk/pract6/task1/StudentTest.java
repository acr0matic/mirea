package mirea.isbo1016.mateyuk.pract6.task1;

import java.util.Arrays;

public class StudentTest {

    public static void main(String[] args) {

        Student[] studArr = new Student[5];

        studArr[0] = new Student(5, "Vanya");
        studArr[1] = new Student(3, "Boris");
        studArr[2] = new Student(2, "Anna");
        studArr[3] = new Student(4, "Nikita");
        studArr[4] = new Student(1, "Oleg");

        System.out.println("Неотсортированный список студентов: ");
        for (Student student : studArr) {
            System.out.println(student);
        }

        Arrays.sort(studArr, Student.IDcomparator);

        System.out.println("Отсортированный список студентов по ID: ");
        for (Student student : studArr) {
            System.out.println(student);
        }

        Arrays.sort(studArr, Student.FirstNameComparator);

        System.out.println("Отсортированный список студентов по Имени: ");
        for (Student student : studArr) {
            System.out.println(student);
        }
    }
}
