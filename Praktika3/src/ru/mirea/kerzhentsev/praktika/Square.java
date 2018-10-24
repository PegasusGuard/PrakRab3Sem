package ru.mirea.kerzhentsev.praktika;

public class Square extends Rectangle{
    public Square(){
        this.length=2;
        this.width=2;
        this.color="red";
        this.filled=true;
    }
    public Square(double size){
        this.length=size;
        this.width=size;
        this.color="red";
        this.filled=true;
    }
    public Square(double size, String color, boolean filled){
        this.length=size;
        this.width=size;
        this.color=color;
        this.filled=filled;
    }

    public void setSize(double size){
        this.width=size;
        this.length=size;
    }

    public double getSize(){
        return this.length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
