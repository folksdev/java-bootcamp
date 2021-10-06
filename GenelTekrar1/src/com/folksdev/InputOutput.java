package com.folksdev;

import java.util.Scanner;

/**
 * Created by İbrahim Başar YARGICI at 4.10.2021
 * <p>
 * <p>
 * Java program to read data of various types using Scanner class.
 */
public class InputOutput {

    public static void main(String[] args) {
        // Scanner Class'ından sc isimli yeni bir nesneyi deklare(declare) ediyoruz (Microsoft Nesne Başlatıcı diyor).
        // Ardından bu nesnenin içine bir parametre vererek tanımlama(initialize)işlemini tamamlıyoruz.
        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan String bir değer alıyoruz
        String name = sc.nextLine();

        // Kullanıcıdan char tipinde bir değer alıyoruz
        char gender = sc.next().charAt(0);

        // Kullanıcıdan numeric değerler alıyoruz
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();

        // Kullanıcıdan aldığımız değerleri daha önceden değişkenlere atamıştık. Şimdi de bu değişkenleri ekrana bastırıyoruz.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);
    }
}