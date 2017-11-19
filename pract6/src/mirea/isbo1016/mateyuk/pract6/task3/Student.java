package mirea.isbo1016.mateyuk.pract6.task3;

import java.util.Comparator;

public abstract class Student{
    private int age;
    private int ID;
    private String FisrtName;

    abstract String getCourse();



    public Student(int age, int ID, String fisrtName) {
        this.age = age;
        this.ID = ID;
        this.FisrtName = fisrtName;
    }

    public Student(int ID, String fisrtName) {
        this.ID = ID;
        FisrtName = fisrtName;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public String getFisrtName() {
        return FisrtName;
    }

    public static Comparator<Student> IDcomparator =
            Comparator.comparing(Student::getID);

    public static Comparator<Student> NameComparator =
            Comparator.comparing(Student::getFisrtName);

    public static Comparator<Student> AgeComparator =
            Comparator.comparing(Student::getAge);

    @Override
    public String toString() {
        return "Student{Course=" + getCourse() +
                " age=" + age +
                ", ID=" + ID +
                ", FisrtName='" + FisrtName + '\'' +
                '}';
    }
}
