package week7.Debug.exercise;

public class Triangle{
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) throws IllegalTriangleException{
        isTriangle(side1, side2, side3);
    }

    public void display() {
        System.out.println("Tam giác hợp lệ với 3 cạnh: " + side1 + ", " + side2 + ", " + side3);
    }

    public void isTriangle(int side1, int side2, int side3) throws IllegalTriangleException
    {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác không được <= 0.");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh không lớn hơn cạnh còn lại.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
}
