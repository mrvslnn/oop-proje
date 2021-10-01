package doWhile;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
        /*kullanıcıdan bir string alın kac tane harf kac tane rakam ve
        kac tane karakter ve rakam oldugunu bulan programı yazınız
         */
Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String s=scan.nextLine().toLowerCase();

        int harfCounter=0;
        int rakamCounter=0;
        int digerCounter=0;
        int k=0;
        do {

            if (s.charAt(k)>='a' && s.charAt(k)<='z'){
                harfCounter++;
            }else if (s.charAt(k)>='0' && s.charAt(k)<='9'){
                rakamCounter++;
            }else{
                digerCounter++;
            }
            k++;
        }while(k<s.length());
        System.out.println("harf sayisi "+ harfCounter);
        System.out.println("rakam sayisi "+rakamCounter);
        System.out.println("diger karakter sayiisi "+digerCounter);

    }
}
