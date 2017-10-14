package mirea.isbo1016.mateyuk.pract2;

public class Author {

    private String name, email;
    private char gender;

    Author(String name,char gender, String email)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return  email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender(){
        return gender;
    }


    @Override
    public String toString()
    {
        return ""+this.name+" ("+this.gender+") at "+this.email+"";
    }
}
