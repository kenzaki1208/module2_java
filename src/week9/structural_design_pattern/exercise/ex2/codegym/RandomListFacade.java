package week9.structural_design_pattern.exercise.ex2.codegym;

import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;
    private RandomNumber randomNumber;

    public RandomListFacade(){
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
        this.randomList = new RandomList();
        this.randomNumber = new RandomNumber();
    }

    public void printRandomEvenList(int size, int min, int max) {
        //tạo danh sách ngẫu nhiên
        List<Integer> numbers = randomList.generateList(size, min, max);

        //lọc số chẵn lẻ
        List<Integer> evenNumbers = listFilter.filterOdd(numbers);

        //in ra màn hình
        listPrinter.printList(evenNumbers);
    }
}
