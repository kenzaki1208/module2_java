package week7.exercise.ex1;

import week7.exercise.ex1.animal.Animal;
import week7.exercise.ex1.animal.Chicken;
import week7.exercise.ex1.animal.Tiger;
import week7.exercise.ex1.edible.Edible;
import week7.exercise.ex1.fruit.Apple;
import week7.exercise.ex1.fruit.Fruit;
import week7.exercise.ex1.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
