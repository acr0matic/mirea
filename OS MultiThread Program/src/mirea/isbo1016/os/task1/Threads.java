package mirea.isbo1016.os.task1;

public class Threads implements Runnable {

    private int ID;
    private int lifeTime;

    public Threads(int identifier, int time)
    {
        this.lifeTime = time;
        this.ID = identifier;
    }

    @Override
    public void run() {
        System.out.println(ID + " поток запущен");

        try {
            Thread.sleep(lifeTime);
        }

        catch (InterruptedException exception) {
            System.out.println(exception);
        }

        System.out.println(ID + " поток завершен");
        Thread.interrupted();
    }
}
