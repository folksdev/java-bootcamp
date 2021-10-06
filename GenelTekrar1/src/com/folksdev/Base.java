package com.folksdev;

/**
 * Created by İbrahim Başar YARGICI at 4.10.2021
 * <p>
 * Bu örnek ile İlkel Veri Tiplerinin örnek kullanım şekillerini görmüş olacağız.
 * <p>
 * Example Source: Data Structures and Algorithms in Java Fourth Edition by Goodrich and Tamassia
 * <p>
 * Intellij IDEA: Ctrl + Alt + T -> Surround With -> Region
 * <p>
 * //TODO Ask why string starts with camel case?
 */
public class Base {
    public static void main(String[] args) {

        //region variable initialization
        boolean flag = true;
        char ch = 'a';
        byte b = 12;
        short s = 24;
        int i = 257;
        long l = 890L;
        float f = 3.1314F;
        double d = 2.1828;
        //endregion

        //region printing to the screen
        System.out.println("flag = " + flag);
        System.out.println("ch = " + ch);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        //endregion
    }
}