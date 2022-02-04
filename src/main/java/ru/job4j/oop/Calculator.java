package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int min(int i) {
        return i - x;
    }

    public int divide(int d) {
       return d / x;
    }

    public void sumAllOperation(int o) {
        return (sum(o) + multiply(o) + min(o) + divide(o));
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10); /*вызов статической переменной*/
        System.out.println(result);
        Calculator calculator = new Calculator(); /*вызов нестатической переменной*/
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int res = Calculator.min(6);
        System.out.println(res);
        Calculator calculator1 = new Calculator();
        int rzt = calculator1.divide(10);
        System.out.println(rzt);
        Calculator calculator2 = new Calculator();
        int ram = calculator2.sumAllOperation();
        System.out.println(ram);
    }
}
