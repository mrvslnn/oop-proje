package dersTekrarı;
import java.util.Arrays;
public class Arrays07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*(String iniz: "GayetBasar�l�"  Diziyi "CoookBasar�l�" ye 
		 * cevirin )
		*
		*/
		String str= "GayetBasar�l�" ;
		str=str.replace("Gayet", "Coook");
		String arr[]= { str };
		System.out.println(Arrays.toString(arr));
	}

}
