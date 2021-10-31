package com.folksdev;

/**
 * Created by İbrahim Başar YARGICI at 28.10.2021
 */
class ArrayDemo {
    public static void main(String[] args) {

        //region Declaration
        // declares an array of integers
        //        int[] anArray;
        //        byte[] anArrayOfBytes;
        //        short[] anArrayOfShorts;
        //        long[] anArrayOfLongs;
        //        float[] anArrayOfFloats;
        //        double[] anArrayOfDoubles;
        //        boolean[] anArrayOfBooleans;
        //        char[] anArrayOfChars;
        //        String[] anArrayOfStrings;
        //
        //        // this form is discouraged
        //        float anArrayOfFloats[];
        //endregion

        //        // declares an array of integers
        //        int[] anArray;
        //
        //        // allocates memory for 10 integers
        //        anArray = new int[10];
        //
        //        // initialize first element
        //        anArray[0] = 100;
        //        // initialize second element
        //        anArray[1] = 200;
        //        // and so forth
        //        anArray[2] = 300;
        //        anArray[3] = 400;
        //        anArray[4] = 500;
        //        anArray[5] = 600;
        //        anArray[6] = 700;
        //        anArray[7] = 800;
        //        anArray[8] = 900;
        //        anArray[9] = 1000;

        //region Shortcut
        int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        //endregion

        //region Boiler Print
        //        System.out.println("Element at index 0: " + anArray[0]);
        //        System.out.println("Element at index 1: " + anArray[1]);
        //        System.out.println("Element at index 2: " + anArray[2]);
        //        System.out.println("Element at index 3: " + anArray[3]);
        //        System.out.println("Element at index 4: " + anArray[4]);
        //        System.out.println("Element at index 5: " + anArray[5]);
        //        System.out.println("Element at index 6: " + anArray[6]);
        //        System.out.println("Element at index 7: " + anArray[7]);
        //        System.out.println("Element at index 8: " + anArray[8]);
        //        System.out.println("Element at index 9: " + anArray[9]);
        //endregion

        //region For print
        System.out.println("\nFOR");
        //        for (int i = 0; i < anArray.length; i++) {
        //            System.out.println("Element at index " + i + ": " + anArray[i]);
        //        }
        //endregion

        //region For each print
        System.out.println("\nFOR EACH");
        for (int value: anArray) {
            System.out.println("Element: " + value);
        }
        //endregion
    }
}