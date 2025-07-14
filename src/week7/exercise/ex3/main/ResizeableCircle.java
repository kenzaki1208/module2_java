package week7.exercise.ex3.main;

import week7.exercise.ex3.codegym.Circle;

public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() * (1 + percent / 100));
    }
}
