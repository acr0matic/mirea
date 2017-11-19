package mirea.isbo1016.mateyuk.pract6.task2;

public class Student {
    private int mark;
    private String FirstName;

    public Student(int mark, String firstName) {
        this.mark = mark;
        FirstName = firstName;
    }

    public Student(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public String getFirstName() {
        return FirstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                ", FirstName='" + FirstName + '\'' +
                '}';
    }


}
