package mirea.isbo1016.mateyuk.pract6.task2;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student[] studArr = new Student[5];

        studArr[0] = new Student(65, "Vanya");
        studArr[1] = new Student(78, "Boris");
        studArr[2] = new Student(29, "Anna");
        studArr[3] = new Student(12, "Nikita");
        studArr[4] = new Student(97, "Oleg");

        System.out.println("Неотсортированный список студентов: ");
        for (Student student : studArr) {
            System.out.println(student);
        }

        System.out.println("Отсортированный список студентов в обратном порядке по баллам: ");
        Arrays.sort(studArr, new SortingStudentsByGPA().reversed());

        for (Student student : studArr) {
            System.out.println(student);
        }
    }

}
