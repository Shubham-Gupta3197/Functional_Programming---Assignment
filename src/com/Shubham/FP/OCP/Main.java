package com.Shubham.FP.OCP;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calci = new Calculator();
        Addition add = new Addition(18,12);
        Subtraction sub = new Subtraction(55,18);
        Multiplication mul = new Multiplication(50,15);

        calci.calculate(add);
        double addResult=add.perform();
        System.out.println("Addition of both number is:  "+addResult);

        calci.calculate(sub);
        double subResult=sub.perform();
        System.out.println("Subtraction of both number is:  "+subResult);

        calci.calculate(mul);
        double mulResult=mul.perform();
        System.out.println("Multiplication of both number is:  "+mulResult);
    }
}
