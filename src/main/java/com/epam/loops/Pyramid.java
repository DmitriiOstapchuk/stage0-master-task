package com.epam.loops;
import java.lang.StringBuilder;
public class Pyramid {

    public void printPyramid(int cathetusLength) {
        StringBuilder newLevel = new StringBuilder ("1");
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j < (cathetusLength - i); j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                String s = String.valueOf(i);
                newLevel.insert(0, s);
                newLevel.append(s);
            }
            System.out.println(newLevel);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
