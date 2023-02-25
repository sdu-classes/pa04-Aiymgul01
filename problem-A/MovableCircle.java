package com.company;

public class MovableCircle implements Movaable{
    int radius;
    MoveablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MoveablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();

    }

    @Override
    public void moveLeft() {
        center.moveLeft();

    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
    public String toString(){
        return center.toString()+", radius = "+radius+"";

    }
}
