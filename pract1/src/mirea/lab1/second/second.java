package mirea.lab1.second;

public class second {
    public static void main(String[] args) {
        float[] a = new  float[10];
        a[0] = 1f;
        for (int i = 1; i < 10; i++)
        {
            a[i] = 1f/(i+1);
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("%d. " + "%.2f \n", i+1, a[i]);
        }
    }
}
