package laptopproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Data {
 public ArrayList<String>  PcData(int laptopId){

     Map<Integer, ArrayList<String>> pcdata=new HashMap<>();

     ArrayList<String> l1=new ArrayList<>();
     l1.add("Apple");
     l1.add("Mini");
     l1.add("5gb");
     l1.add("i5");
     l1.add("Red");
    pcdata.put(11000058,l1);

     ArrayList<String> l2=new ArrayList<>();
     l2.add("Samsung");
     l2.add("Middle");
     l2.add("16gb");
     l2.add("i7");
     l2.add("Black");
     pcdata.put(11000055,l2);

     return pcdata.get(laptopId);
 }
}
