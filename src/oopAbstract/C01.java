package oopAbstract;

public abstract class C01 {
/*1)bazen child class lar parent class daki mthodlarin bodylerini hep 
 * degistirerek kulan�rlar
 *bu tip durumlarda parent class daki methoda body koymak manas�z olur
 *cunku parent class taki method body ic kullan�lmaz
 *bu manas�zl�g� giddermek icin java bize body siz method uretme imkan� 
 *verir body siz methodlara abstract 
 *method denir
 *2)parent class daki body siz methodlari (abstract)
 *chlid class lar override etmek zorundadir
 *biz bir application olustururken child class lari parent classdaki 
 *baz� methodlari override etmek zorunda b�rakamk �stersek o methodlar�
 *abstract method yapar�z
 *3)abstract method olusturmak icin a){} k�sm�n� yazmay�n
 *b)access modifier dan sonra abstract keywordunu kullan�n
 *4)abstract methodlar sadece abstract classlar �c�nde olusturulabilir
 *5)abstract class olusturmak icin access modifier dan sonra 
 *6)abstaract keyword u ile method body bir arada kullan�lamaz
 *7)abstract class icinde hem abstaract hem deabstract olamayn(concrete) 
 *methodlar kullan�labilir
  8)bir concrete class abstact clasa extend edildiginde abstract class 
   icindeki tum abstract methodlar� override etmek zorundad�r
   aksi takdirde java compile time error verir
   fakat concrete methodlar� override etmek zorunda degilidr
   concrete methodlar�n override edilmesi istege bagl�d�r
  9)bir abstract class baska bir abstract class aextensd edildiginde 
   herhnagi nbir methodu override etmek zorunda degildir �sterse ooverride 
   eder istersse etmz
  *10)final class alr�n child class � olamaz.abstract class lar child class 
  *lara talimat vermek icin olusturulur
  *eger bir class �final yaparsan�z o class �n child class �olamayacag�ndan 
  *abstract olmas� mant�kl� degildir. bu yuzden java abstaract class lar�n final 
  *olmas�na musaade etmez 
  *11)abstaract method uretmemz��zn sebebi child class lar�n kullan�labilmesidir.
  *eger methodu final yaparsak bu o method override edilemez demektir yani; 
  *child class lar kullanamaaz demektri
  *bu celiskiden dolay� java abstaract methodlar� final olmas�na musade etmez
  *12)abstract method lar private olamazlar cunku abstaract methodlar baska
  * class lar taraf�ndan kullan�lmak �c�n uret�l�t halbuk� pr�vate methodlar 
  * baska classlar taraf�ndan kullan�lamazlar
  *13)abstract methodlar static olamazlar cunk ustat�c methodlar override 
  *edilemezler halbuki biz abstaract methodlar� override etmek icin uretiriz
  *!!!ABSTARACT CLASSLARDAN OBJECT URET�LEMEZ
  */
	
	
	public abstract void motor();
	public void deri() {
		System.out.println("koltuklar deri");
	}
}
