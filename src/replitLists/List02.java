package replitLists;


	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	public class List02 {

		public static void main(String[] args) {
			/*Create a 10-element list. Swap the 8th element with the 3rd element.


			INPUT : 
			String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

			Output:
			          
			[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]        */ 

			
			String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
			
			List <String> list= Arrays.asList(names);
			
			
			
			
			System.out.println(Collections.replaceAll(list, "Kemal", "Furkan"));
			System.out.println(Collections.replaceAll(list, "Furkan", "Kemal"));
			System.out.println(list);
			
		}

	}

