package replitLists;

import java.util.ArrayList;
import java.util.List;

public class List04 {
	/*Girdi olarak verilen listedeki isimlerden 'a' harflerini silen bir program yaz�n�z.


    G�R�� :
    list1={"Ali","Veli","Ayse","Fatma","�mer"}

    �IKTI :
    
    [Veli,�mer]
*/
		public static void main(String[] args) {
	        List<String> list1 = new ArrayList<String>();
	       list1.add("Ali");
	       list1.add("Veli");
	       list1.add("Ayse");
	       list1.add("Fatma");
	       list1.add("Omer");

	        List<String> list2 = new ArrayList<String>();
	        for (String each:list1) {
	            if (!each.toLowerCase().contains("a")) {
	                list2.add(each);
	            }
	        }

	        System.out.println(list2);
	    }

	}


