package replitForWhile;

public class C03 {

	public static void main(String[] args) {
	/*	Bir String icerisinde yinelenen karakterleri d�nd�ren bir kod yaz�niz.(m�lakat Sorusu)

		Input : 
			 
		String str=�Javaisalsoeasy� 

		Output: a s
		*/
		String tekrar = "";
        String str = "Javaisalsoeasy";
        
        for (int i = 0; i < str.length(); i++) {
            if ((str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i)))) {
            	
                if (!tekrar.contains(Character.toString(str.charAt(i)))) {
                    tekrar += str.charAt(i) + " ";
                }
            }
        }
        System.out.println(tekrar);
	}
}


