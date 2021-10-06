package com.folksdev;

/**
 * Created by İbrahim Başar YARGICI at 5.10.2021
 * <p>
 * Bu örnek ile kodu kafamızda çalıştırarak mantıksal bir hatası var mı, varsa nasıl çözüm bulabiliriz,yoksa çıktı ne olur gibi
 * çözümlemelerde bulunacağız.
 */
public class TrickyWhile {
    public static void main(String[] args) {
        // TODO ask what will be happen here
        bloodUsWithProcess(3);

        // TODO ask what will be the result of function
        // bloodUsWithResult(3);
    }

    private static void bloodUsWithProcess(int limit) {
        int sum = 0;
        while (limit >= 0) {
            sum += limit;
        }
    }

    private static void bloodUsWithResult(int limit) {
        int sum = 0;
        while (limit >= 0) {
            sum += limit;
            System.out.print(sum + " ");
            limit--;
        }
    }


}
