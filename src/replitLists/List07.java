package replitLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List07 {
    /*
    write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array

Input :{1,2,3,4,5,6}

element:6

Output : [1,2,3,4,5]

bir diziden belirli bir öğeyi çıkarmak ve kalan öğeleri yeni bir diziye koymak için bir Java programı yazın
 ve yeni diziyi yazdırın Girdi :{1,2,3,4,5,6} öğe:6 Çıktı : [1,2 ,3,4,5]
     */
    public static void main(String[] args) {
        List <Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);

    }
}
