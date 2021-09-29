package laptopproject;

import java.util.ArrayList;

public class Fiyat {
    public static int getFiyat(int laptopId){
        Data obj=new Data();
        ArrayList<String> arrayList =obj.PcData(laptopId);
     int totalTutar=   Hesap.getColor(arrayList) +Hesap.getCPU(arrayList)
             +Hesap.getRam(arrayList) +Hesap.getSize(arrayList);
return totalTutar;
    }
    public static int getIndirim(int fiyat, int indirim){
        return fiyat - (fiyat * indirim / 100);
    }
}
