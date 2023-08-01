package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int first = Character.getNumericValue(String.valueOf(number).charAt(0));
        int second = Character.getNumericValue(String.valueOf(number).charAt(1));
        int third = Character.getNumericValue(String.valueOf(number).charAt(2));
        int fourth = Character.getNumericValue(String.valueOf(number).charAt(3));
        int sum = first + second + third + fourth;
        System.out.println(sum);
    }

}
