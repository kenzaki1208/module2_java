package week7.exercise.ex1.animal;

import week7.exercise.ex1.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck cluck!";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
