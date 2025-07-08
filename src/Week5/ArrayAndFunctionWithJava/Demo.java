package Week5.ArrayAndFunctionWithJava;


public class Demo {
    public static void main(String[] args) {
        //local
        //khai báo tham chiếu tất cả giá trị trong mảng
//        double[] myList;
//        myList = new double[10];
//        //System.out.println(myList[0]);
//
//        //Nhập giá trị vào
//        //Ép kiểu ngầm định casting byte -> short -> int -> long -> float -> double
//        myList[0] = 69;
//        myList[5] = 96;
//        myList[9] = 100d;
//
//        System.out.println("Value at index 9 is " + myList[9]);
//
//        //In ra
//        System.out.println("Length of array is " + myList.length);
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(myList[i]);
//        }

        //int [] numbers = {69, 96, 29};
        //System.out.println(numbers.length);
        //System.out.println(numbers[1]);
        //int[] numbers = new int[3];
        //numbers[0] = 69;
        //numbers[1] = 96;
        //numbers[2] = 29;


//        int [] numbers = {1, 2, 3, 4, 5};
//        //vòng lặp for
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println("Number: " + numbers[i]);
//
//        }


        //for (elementType elementRefVar : collections)
//        for (int number : numbers) {
//            System.out.println("Number: " + number);
//        }


//        int larger = max(3, 4);
//        System.out.println("Larger number is " + larger);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of numbers is " + sum(numbers));
    }

//    public static int max(int a, int b) {
//        return a > b ? a : b;
//    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
