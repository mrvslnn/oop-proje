package oopEncapsulation;

public class E01 {

		/*1)encapsulation kisaca data hiding saklamak demketir
		 *2)basar�l� b�r encapsulation asag�daki ozelliklere sahip olmal�d�r
		 * a)nas�l kullan�lacag� belli olmal�
		 * b)kodun karmas�kl�g� kullan�m�n karmas�kl�g�na sebep olmamal�.Yani cok karmas�k
		 *   kodlardan olusan bir yapi basit bir sekilde kullan�labilmektedir
		 * c)bir bolumun bozulmas� baska bolumler�n bozulmas�na sebep olmamal�
          3)encapsulat�on nas�l yap�l�r
            a)access  modifierlari private olarak kullan�n�z
            b)getter ve setter methodlari ile encapsuled datalara ulas�p
             onlar� okuyabilir(getter) ve degistirebilriz(setter)
*         4) encapsulation faydalar�
*         a)esneklikk. normalde asag�daki ornekte age verable n�n
*         deger 25d�r
*         diger class alarda setage methodunu kullanarak age veriable nin degerini 
*         istedigimiz gibi degistirip kullanabiliriz
*         b)reusability getter ve stter methodlar� bir kere olusturunuz
          c)�stedg�n�z datay� okuyabilir (getter olusturur) istedginiz datay�
           okunamaz(getter olusturnaz)hale getirebilirsiniz
          d)istediginiz datay� degisitirebilir(setter olusturarak)istediginiz datay�
           degistirilemz(setter olussturmaz) yapabilirsiniz
          note=tum veriable lar private ve sadece gtter methodlar� olusturudm bu tarz 
          bir  class da data lar saddece okunabilir degistirilemz bu tar
          class lara immutable class denir
          e)kullan�c�n�n kulland�g� sistem arakas�ndaki karmas�k yap�y� kullan�c�yaa 
          gostermez boylece kullan�c� yapamak �sted�kler�n� daha rahat yapar
          5)bir class da a)tum verianle lar private ise ve b)tum gtter ve c)tum setter
           lar olusturulmussa bu class "fully encapsulated" olaarak adland�r�rl�r
          6)getter ve setter methodlar�na yan� zmananda java beans de denir
*
*
*
*/
		private int age=25;
		private String name="ali";
		
		//getter olusturmak
		public int getAge() {
			return age;
		}
		
		public String getName() {
			return name;
		}
		//setter olusturmak
		public void setAge(int age) {
			this.age = age;
		}
		public void setName(String name) {
			this.name = name;
		}
		
          
		
	}


