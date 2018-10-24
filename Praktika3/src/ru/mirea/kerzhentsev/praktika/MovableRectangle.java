package ru.mirea.kerzhentsev.praktika;

public class MovableRectangle implements Movable {
    protected MovablePoint topLeft = new MovablePoint(0,0,0,0);
    protected MovablePoint bottomRight = new MovablePoint(0,0,0,0);

    public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed){
        this.topLeft.x=x1;
        this.topLeft.y=y1;
        this.topLeft.yspeed=yspeed;
        this.topLeft.xspeed=xspeed;
        this.bottomRight.x=x2;
        this.bottomRight.y=y2;
        this.bottomRight.xspeed=xspeed;
        this.bottomRight.yspeed=yspeed;
    }

    @Override
    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveRight();
    }

    @Override
    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }

    @Override
    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    @Override
    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
