package doWhile;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        /*kullanıcıdan sayı alınız sayı ondan kucuk ıse kazandınız yazdrın
        sayı on veya ondan buyukse ekrana sayı giriniz yazdırın
         */
        Scanner scan=new Scanner(System.in);
        int s=0;
        do {
            System.out.println("sayi giriniz");
            s =scan.nextInt();
        }while(s>=10);
        System.out.println("kazandınız");
    }
}
