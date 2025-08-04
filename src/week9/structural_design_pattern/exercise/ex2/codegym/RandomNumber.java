package week9.structural_design_pattern.exercise.ex2.codegym;

public class RandomNumber {
    public int generateInteger(int min, int max){
        double randomDouble = Math.random();
        return (int) (randomDouble * (max - min + 1) + min);
    }
}