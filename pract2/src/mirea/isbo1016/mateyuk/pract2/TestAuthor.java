package mirea.isbo1016.mateyuk.pract2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Sue Grant", 'm', "sugrant@somewhere.com");
        System.out.println(a1);
        a1.setEmail("sgrant@gmail.com");
        System.out.println(a1);

    }
}
