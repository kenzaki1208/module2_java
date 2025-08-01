package week9.design_patterns.exercise.ex2;

public class Main {
    public static void main(String[] args) {
        Gun gun1 = new Gun();
        System.out.println("Start");
        gun1.fire();
        System.out.println("Game Over");
        System.out.println("Tocal bullet created: " + Bullet.count);

        Gun gun2 = new Gun();
        System.out.println("Start");
        gun2.fireInPool();
        System.out.println("Game Over");
        System.out.println("Tocal bullet created: " + Bullet.count);
    }
}
