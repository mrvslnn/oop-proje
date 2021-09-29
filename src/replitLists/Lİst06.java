package replitLists;

import java.util.ArrayList;
import java.util.List;

public class L�st06 {

		 public static void main(String[] args) {
			 List<String> list1= new ArrayList<>();
			 		list1.add("John");
			 		list1.add("Brad");
			 		list1.add("Ange");
			 		list1.add("Sofia");
			 		list1.add("Emily");
			 		
			 		
			 		List<String> list2= new ArrayList<>();
			 		list2.add("Sofia");
			 		list2.add("brad");
			 		list2.add("grace");
			 		list2.add("emily");
			 		list2.add("Omer");
			 		list2.add("hazel");
			 		
			 		
			 		ortakList(list1,list2);

			 	}

			 	private static void ortakList(List<String> list1, List<String> list2) {
			 		List<String> ortakIsimler =new ArrayList<>();
			 		
			 		for (int i = 0; i < list1.size(); i++) {
			 			
			 			for (int j = 0; j < list2.size(); j++) { 
			 				
			 				if (list1.get(i).equalsIgnoreCase(list2.get(j))) {
			 					
			 					ortakIsimler.add(list2.get(j));
			 				}
			 				
			 			}
			 			
			 		}
			 		System.out.println(ortakIsimler);
	}

}
