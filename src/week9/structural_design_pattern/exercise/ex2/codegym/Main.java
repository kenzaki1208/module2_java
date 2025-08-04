package week9.structural_design_pattern.exercise.ex2.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RandomListFacade randomListFacade = new RandomListFacade();

        System.out.println("Random numbers:");
        //viết ngẫu nhiên 10 số chẵn ngẫu nhiên trong 100 số
        randomListFacade.printRandomEvenList(10, 1, 100);
    }
}
