package week6.inheritance.wednesday.triangle;

public class TriangleClassifier {
    public static String classify(int side1, int side2, int side3) {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "Không phải là tam giác";
        }

        if (side1 == side2 && side2 == side3) {
            return "Tam giác đều";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "Tam giác cân";
        } else {
            return "Tam giác thường";
        }
    }
}
