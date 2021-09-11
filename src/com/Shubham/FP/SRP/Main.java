package com.Shubham.FP.SRP;

public class Main {
    public static void main(String[] args) {
        Text_Manipulator text_manipulator = new Text_Manipulator("Shubham Gupta ");
        TextPrinter textPrinter = new TextPrinter(text_manipulator);
        String toPrint1=text_manipulator.appendText("SRP_FP_Code_Example");
        System.out.println(toPrint1);
        String toPrint2=textPrinter.printOutEachWordOfText();
        System.out.println(toPrint2);
    }
}
