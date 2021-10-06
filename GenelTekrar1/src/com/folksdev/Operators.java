package com.folksdev;

/**
 * Created by İbrahim Başar YARGICI at 5.10.2021
 */
public class Operators {

    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = a++ + ++b;
        int sum = a + b + c;

        System.out.print(a);
        System.out.print(b);
        System.out.println(c);
        System.out.print(sum);
    }

    public float fCalculate(int x) {
        return (float) (x * x) / 2 + 9;
    }
}
