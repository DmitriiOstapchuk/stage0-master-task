package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int first = Character.getNumericValue(String.valueOf(number).charAt(0));
        int second = Character.getNumericValue(String.valueOf(number).charAt(1));
        int third = Character.getNumericValue(String.valueOf(number).charAt(2));
        int result = third * 100 + second * 10 + first;
        System.out.println(result);
    }

}
