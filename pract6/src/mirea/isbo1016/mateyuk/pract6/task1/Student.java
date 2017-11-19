package mirea.isbo1016.mateyuk.pract6.task1;

import java.util.Comparator;

public class Student {

    private String firstName;
    private int IDnumber;

    public Student(int IDnumber, String firstName) {
        this.IDnumber = IDnumber;
        this.firstName = firstName;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public static Comparator<Student> FirstNameComparator
            = Comparator.comparing(Student::getFirstName);

    public static Comparator<Student> IDcomparator
            = Comparator.comparing(Student::getIDnumber);

    @Override
    public String toString() {
        return "Student[IDnumber = " + IDnumber + ", First Name = " + firstName +"]";
    }
}
