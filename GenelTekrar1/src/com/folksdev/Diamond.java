package com.folksdev;

/**
 * Created by İbrahim Başar YARGICI at 1.10.2021
 *
 * (Triangle Printing Program) Write an application that displays the following patterns separately, one below the other.
 * Use for loops to generate the patterns. All asterisks (*) should be printed by a single statement of the form
 * System.out.print('*'); which causes the asterisks to print side by side. A statement of the form System.out.println();
 * can be used to move to the next line. A statement of the form System.out.print(' '); can be used to display a space for
 * the last two patterns. There should be no other output statements in the program. [Hint: The last two patterns require
 * that each line begin with an appropriate number of blank spaces.]
 *
 *       a)        b)                 c)                    d)
 *        *          **********        **********            *
 *        **          *********        *********            **
 *        ***          ********        ********            ***
 *        ****          *******        *******            ****
 *        *****          ******        ******            *****
 *        ******          *****        *****            ******
 *        *******          ****        ****            *******
 *        ********          ***        ***            ********
 *        *********          **        **            *********
 *        **********          *        *            **********
 *
 * Ödev:
 *            *
 *           ***
 *          *****
 *         *******
 *        *********
 *         *******
 *          *****
 *           ***
 *            *
 */
public class Diamond {
    public static void main(String[] args) {
        int rowNumber = 3;
        // a
        drawLeftBottomCenterPerpendicularTriangle(rowNumber);

//        //b
//        drawRightTopCenterPerpendicularTriangle(rowNumber);
//
//        // c
//        drawLeftTopCenterPerpendicularTriangle(rowNumber);
//
//        // d
//        drawRightBottomCenterPerpendicularTriangle(rowNumber);
    }

    private static void drawRightBottomCenterPerpendicularTriangle(int rowNumber) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < rowNumber - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawLeftTopCenterPerpendicularTriangle(int rowNumber) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = rowNumber - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawRightTopCenterPerpendicularTriangle(int rowNumber) {
        for (int i = 0; i < rowNumber; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 10 - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * {
     *     {},
     *     {},
     *     {},
     * }
     * @param rowNumber
     */
    private static void drawLeftBottomCenterPerpendicularTriangle(int rowNumber) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawDiamond(int rowNumber) {
        for (int i = 0; i < rowNumber; i++) {
            // TODO solve related asked question to get better understanding!
        }
    }
}