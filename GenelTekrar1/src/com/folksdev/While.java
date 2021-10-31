package com.folksdev;

/**
 * Created by İbrahim Başar YARGICI at 5.10.2021
 * <p>
 * Bu soruda kodun çıktısının ne olacağını ilk başta kafamızda hesaplayacağız. Ardından da debugging point yardımı ile program
 * akışını daha iyi görecek, özümseyeceğiz.
 */
public class While {
    public static void main(String[] args) {
        int x = 1;
        int total = 0;
        while (x <= 10) {
            int y = x * x;
            System.out.print(y +" ");
            total += y;
            ++x; //TODO ask that what is the difference between ++x and x++
        }

        System.out.printf("\nTotal is %d%n", total);
    }
}