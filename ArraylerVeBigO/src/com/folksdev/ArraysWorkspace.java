package com.folksdev;

import java.util.Arrays;

/**
 * Created by İbrahim Başar YARGICI at 28.10.2021
 */
public class ArraysWorkspace {


    public static void main(String[] args) {
        int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int[] copyArray = Arrays.copyOf(anArray, 4);

        System.out.println("\ncopyArray");
        //TODO how to print copyArray ?
        for (int value: anArray) {
            System.out.println(value);
        }

        //        System.out.println("\nstream");
        //        Arrays.stream(copyArray).forEach(System.out::println);

        //        System.out.println("\ncopyArrayTwo");
        //        int[] copyArrayTwo = Arrays.copyOfRange(anArray, 5,8);
        //        for (int value: copyArrayTwo) {
        //            System.out.println(value);
        //        }

        //        System.out.println("\nfill");
        //        Arrays.fill(anArray,10);
        //
        //        for (int value: anArray) {
        //            System.out.println(value);
        //        }
    }
}
