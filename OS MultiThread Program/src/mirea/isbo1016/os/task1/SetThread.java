package mirea.isbo1016.os.task1;

public class SetThread {

    private int ID;
    private int lifeTime;

    private Runnable runnable;
    private Thread thread;

    public SetThread(int lifeTime, int identifier) {
        this.ID = identifier;
        this.lifeTime = lifeTime;
        runnable = new Threads(ID, lifeTime);
        thread = new Thread(runnable);
    }

    void pushThread() {
        thread.start();
    }

    boolean checkThread() {
        return thread.isAlive();
    }

}
