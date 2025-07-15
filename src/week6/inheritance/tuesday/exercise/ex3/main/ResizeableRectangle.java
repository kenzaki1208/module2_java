package week6.inheritance.tuesday.exercise.ex3.main;

import week6.inheritance.tuesday.exercise.ex3.codegym.Rectangle;

public class ResizeableRectangle extends Rectangle implements Resizeable{
    public ResizeableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() * (1 + percent / 100));
        setLength(getLength() * (1 + percent / 100));
    }
}
