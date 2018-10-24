package ru.mirea.kerzhentsev.praktika;

public class MovableCircle implements Movable {
    protected int radius;
    protected MovablePoint center = new MovablePoint(0,0,0,0);

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius=radius;
        this.center.x=x;
        this.center.y=y;
        this.center.xspeed=xSpeed;
        this.center.yspeed=ySpeed;
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
