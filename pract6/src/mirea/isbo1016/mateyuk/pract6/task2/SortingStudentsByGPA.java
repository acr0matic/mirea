package mirea.isbo1016.mateyuk.pract6.task2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMark() - o2.getMark();
    }
}
