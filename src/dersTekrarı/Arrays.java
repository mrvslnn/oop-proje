package dersTekrarı;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*   $ ve  �  isareti olanlarin toplamlarini ayri ayri bulun
        String str = "$1 $23 $134 $2 $7 $24 �32 �40 �2 �65 �4 ";
        */
String str= "$1, $23, $134 $2 $7 $24 �32 �40 �2 �65 �4";
String [] arr=str.split(" ");
int topDolar=0;
int topEuro=0;

for (int i = 0; i < arr.length; i++) {
	if (arr[i].contains("$")) {
		topDolar+=Integer.parseInt(arr[i].replace("$", " "));
	}else {
		topEuro+=Integer.parseInt(arr[i].replace("�", " "));
	}
}
System.out.println(topDolar);
System.out.println(topEuro);
	}

}
