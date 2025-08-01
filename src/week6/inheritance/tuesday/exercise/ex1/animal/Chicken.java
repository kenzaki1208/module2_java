package week6.inheritance.tuesday.exercise.ex1.animal;

import week6.inheritance.tuesday.exercise.ex1.edible.Edible;

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
