package atmproject;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
class Options extends Account {
    Scanner scan = new Scanner(System.in);
    DecimalFormat paraFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> musteriData = new HashMap<Integer, Integer>();
    public void login() {
        boolean flag = true;
        do {
            try {
                musteriData.put(12345, 123);
                musteriData.put(23456, 234);
                musteriData.put(34567, 345);
                musteriData.put(45678, 456);
                musteriData.put(56789, 567);
                System.out.print("Lutfen musteri numaranizi giriniz: ");
                setMusteriNo(scan.nextInt());
                System.out.println();
                System.out.println("Lutfen PIN numaranizi giriniz: ");
                setPinNo(scan.nextInt());
            } catch (Exception e) {
                System.out.println("Lutfen gecerli musteri ve PIN numarasi giriniz. Cikmak icin 'Q' tusuna basiniz.");
                String cikis = scan.next();
                if (cikis.equalsIgnoreCase("Q")) {
                    flag = false;
                }
            }
            Set<Map.Entry<Integer, Integer>> musteriDataSet = musteriData.entrySet();
            for (Map.Entry<Integer, Integer> w : musteriDataSet) {
                if (w.getKey() == getMusteriNo() && w.getValue() == getPinNo()) {
                    islemSec();
                }
            }
        } while (flag);
    }
    public void islemSec() {
        System.out.println("Asagidaki islemlerden birini seciniz:");
        System.out.println("1: Vadesiz Hesap Islemleri");
        System.out.println("2: Vadeli Hesap Islemleri");
        System.out.println("3: Cikis");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                // vadesiz islemler
                break;
            case 2:
                // vadeli islemler
                break;
            case 3:
                System.out.println("Tesekkur eder, tekrar bekleriz.");
                break;
            default:
                System.out.println("Lutfen gecerli bir secim yapiniz.");
                islemSec();
        }
    }
}

