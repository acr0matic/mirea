package mirea.isbo1016.mateyuk.lab7;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();
        LinkedList<Student> students = new LinkedList<>();

        states.add("Germany");
        states.addFirst("Russia");
        states.addLast("Italy");
        states.add("Ukraine");

        System.out.println("Текущий список стран: ");
        for (String state : states)
            System.out.println(state + " ");

        states.set(2, "Moldova");
        states.add("Poland");

        System.out.println("\nНовый список стран: ");
        for (String state : states)
            System.out.println(state + " ");

        if (states.contains("Germany"))
            System.out.println("В списке есть Германия!");

        states.removeLast();
        states.removeFirst();

        students.add(new Student("Alex"));
        students.addFirst(new Student("Vanya"));
        students.add(new Student("Nikita"));
        students.addLast(new Student("Oleg"));
        students.remove(1);

        System.out.println("\nСписок студентов: ");
        for (Student student : students)
            System.out.println(student.getName());

    }
}
