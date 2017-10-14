package mirea.isbo1016.mateyuk.lab2.human;

public class head {

    public String hair;
    public String eyeColor;

    head()
    {

    }

    head(String hair, String eyeColor)
    {
        this.hair = hair;
        this.eyeColor = eyeColor;
    }

    public String getHairColor()
    {
        return hair;
    }
    public String getEyeColor()
    {
        return eyeColor;
    }

    public void changeHairColor(String hair)
    {
        this.hair = hair;
    }

    @Override
    public String toString() {
        return "head{" +
                "hair='" + hair + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
