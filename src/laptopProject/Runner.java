package laptopproject;

public class Runner {
    public static void main(String[] args) {


        Fiyat f1 = new Fiyat();
        int fiyat=f1.getFiyat(11000058);
        System.out.println("laptop fiyatı: "+fiyat);
        System.out.println("indirimli fiyat: "+f1.getIndirim(fiyat,30));

    }
}
