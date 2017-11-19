package mirea.isbo1016.mateyuk.pract6.task3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList <ITstudent> studensIT = new ArrayList<>();
        ArrayList <RTSstudent> studentsRTS = new ArrayList<>();
        ArrayList <Student> students = new ArrayList<>();

        studensIT.add(new ITstudent(19,3,"Denis"));
        studensIT.add(new ITstudent(18,1,"Andrey"));
        studensIT.add(new ITstudent(20,2,"Nikita"));

        studentsRTS.add(new RTSstudent(21,2, "Ivan"));
        studentsRTS.add(new RTSstudent(18,3, "Ilya"));
        studentsRTS.add(new RTSstudent(19,1, "Alexsandr"));

        students.addAll(studensIT);
        students.addAll(studentsRTS);

        Collections.sort(students, Student.IDcomparator);

        System.out.println("Отсортированный список студентов по ID: ");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Student.NameComparator);

        System.out.println("Отсортированный список студентов по имени: ");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Student.AgeComparator);

        System.out.println("Отсортированный список студентов по возрастату: ");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
