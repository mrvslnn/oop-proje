package dersTekrarı;

import java.util.ArrayList;
import java.util.List;

public class Arrays09 {

	public static void main(String[] args) {
		/*
         * Input olarak verilen listteki isimlerden
         * icinde �a� harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
		List<String> list1= new ArrayList<>();
		list1.add("ALI");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer");
		
		List<String> list2= new ArrayList<>();
for (String each : list1) {
	if (!each.toLowerCase().contains("a")) {
		list1.add(each);
		
	}
	
}
System.out.println(list2);
	}

}
