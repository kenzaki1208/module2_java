package Week5.ArrayAndFunctionWithJava.PracticalExercises;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 30, 5, 7, 9},
                {2, 4, 6, 800, 10},
                {15, 17, 11, 193, 19},
                {24, 28, 20, 22, 26}
        };

        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Max value in the array is: " + max);
    }
}
