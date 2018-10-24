package ru.mirea.kerzhentsev.praktika;

public class MoveTest {
    public static void main(String[] args) {
        MovableCircle c1 = new MovableCircle(5,6,2,2,6);
        c1.moveDown();
        c1.moveLeft();
        System.out.println(c1);
        c1.moveUp();
        c1.moveRight();
        System.out.println(c1);

        MovableRectangle r1 = new MovableRectangle(5,6,9,9,2,2);
        r1.moveDown();
        r1.moveLeft();
        System.out.println(r1);
        r1.moveUp();
        r1.moveRight();
        System.out.println(r1);
    }
}
