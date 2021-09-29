package dersTekrarı;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays11 {

	public static void main(String[] args) {
		
//		2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki t�m elemanlar� bir
//		listeye kopyalayan ve harf s�ras�na g�re yazd�ran bir METHOD yaz�n�z.
//		Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
//		   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

		//String isim[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};
/*
"Ali", "Veli", "Ayse"  -->0. kat
"Hasan", "Can"        -->1.kat
"Suzan"               -->.kat
 */
		List<String> list=new ArrayList<>();
		String isim[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};
		for (int i = 0; i < isim.length; i++) {
			for (int j = 0; j < isim[i].length; j++) {
				list.add(isim[i][j]);
			}
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
