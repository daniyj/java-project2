package com.example.javaproject2.javaproject2.week1.day5;

public class SpaceInvadersMemberVariable {
    int location; //멤버변수

    public void moveLeft(){
        location = location -1;
        System.out.printf("moveleft: %d\n",location);

    }
    public void moveRight(){
        location = location +1;
        System.out.printf("moveRight: %d\n",location);

    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
    }
}