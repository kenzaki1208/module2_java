package week9.structural_design_pattern.practice.p1;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double result = proxy.add(1, 2);
        System.out.println("1 + 2 = " + result);

        result = proxy.add(100, 200);
        System.out.println("100 + 200 = " + result);

        result = proxy.sub(300, 150);
        System.out.println("300 - 150 = " + result);

        result = proxy.div(200, 100);
        System.out.println("200 / 100 = " + result);

        result = proxy.mul(123, 456);
        System.out.println("123 * 456 = " + result);
    }
}
