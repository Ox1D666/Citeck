package com.citeck.task3;

/**
 * Замена крайне правого нуля целого числа представленного в двоичной системе исчисления на 1.
 */
public class Algorithm {
    public int replacement(int number) {
        String strNumber = Integer.toBinaryString(number);
        strNumber = Integer.toBinaryString(Integer.parseInt(strNumber, 2) +
                Integer.parseInt("1", 2));
        strNumber = Integer.toBinaryString(Integer.parseInt(strNumber, 2) |
                Integer.parseInt(Integer.toBinaryString(number), 2));
        int result = Integer.parseInt(strNumber, 2);
        return result;
    }
}

