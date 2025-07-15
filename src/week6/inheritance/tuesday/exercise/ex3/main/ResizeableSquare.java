package week6.inheritance.tuesday.exercise.ex3.main;

import week6.inheritance.tuesday.exercise.ex3.codegym.Square;

public class ResizeableSquare extends Square implements Resizeable {
    public ResizeableSquare(double side) {
        super(side);
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() * (1 + percent / 100));
    }
}
