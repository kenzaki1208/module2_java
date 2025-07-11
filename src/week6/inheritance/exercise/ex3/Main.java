package week6.inheritance.exercise.ex3;

public class Main {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("Before move: " + mp.toString());
        mp.move();
        System.out.println("After move: " + mp.toString());

        float[] position = mp.getXY();
        float[] speed = mp.getSpeed();
        System.out.println("Position: x = " + position[0] + ", y = " + position[1]);
        System.out.println("Speed: xSpeed = " + speed[0] + ", ySpeed " + speed[1]);
    }
}
