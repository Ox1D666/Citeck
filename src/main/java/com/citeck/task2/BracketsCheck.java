package com.citeck.task2;

/**
 * Алгоритм проверки корректности регулярного выражения, которое включает [,],(,).
 */
public class BracketsCheck {
    public boolean check(String str) {
        boolean result = false;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(') {
                count1++;
            }
            else if (str.charAt(i) == ')') {
                count1--;
            }
            if(str.charAt(i) == '[') {
                count2++;
            }
            else if (str.charAt(i) == ']') {
                count2--;
            }
        }
        if ((count1 == 0) && (count2 == 0)) result=true;
        return result;
    }
}
