package mirea.isbo1016.mateyuk.pract3.zad2;

public class movablePoint implements movable{
    protected int x,y, xSpeed, ySpeed;

    movablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString()
    {
        return "Speed: " + xSpeed + ";" + ySpeed + " Locate of point: " + this.x + "; " + this.y;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
}
