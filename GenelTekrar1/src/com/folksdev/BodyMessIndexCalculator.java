package com.folksdev;

/**
 * Created by İbrahim Başar YARGICI at 5.10.2021
 * <p>
 * Bu soru ile hem parametreli fonksiyonları tekrar etmiş olacağız hem de koşul şartlarını konuşmuş olacağız.
 */
public class BodyMessIndexCalculator {
    public static void main(String[] args) {
        float bmiInKilogram = calculateBMIWithKilogram(83.461f, 1.778f);
        float bmiInPound = calculateBMIWithPound(184, 5, 10);
        System.out.println("bmiInKilogram: " + bmiInKilogram);
        System.out.println("bmiInPound: " + bmiInPound);

        // TODO can we do this without curly braces?
        // TODO can we do this with switch case?
        if (bmiInKilogram < 18.5) {
            System.out.println("Underweight");
        } else if (bmiInKilogram >= 18.5 && 24.9 < bmiInKilogram) {
            System.out.println("Normal");
        } else if (bmiInKilogram >= 25 && 29.9 < bmiInKilogram) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        for (int i = 0; i > 10 ; i++) {
            System.out.println(i);
        }

        System.out.println();
        printBMIValues();
    }

    private static float calculateBMIWithKilogram(float weightInKg, float heightInM) {
        return generalBMI(weightInKg, heightInM);
    }

    // 1 feet = 12 inch
    // height(in type of inch) = feet * 12 + inches
    private static float calculateBMIWithPound(float weightInPound, int feet, int inches) {
        float height = feet * 12 + inches;
        return 703 * generalBMI(weightInPound, height);
    }

    private static float generalBMI(float weight, float height) {
        return weight / (height * height);
    }

    private static void printBMIValues() {
        System.out.println("Underweight : less than 18.5\n" + "Normal: between 18.5 and 24.9\n" + "Overweight: between 25 and 29.9\n" + "Obese: 30 or greater");
    }
}
