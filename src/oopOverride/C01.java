package oopOverride;

public class C01 {

/*1)parent class daki bir methodu child class a gore 
 * ozellest�rerek
 * kullanamk istersen�z overrifding yapabilirsiniz
 * 2) a)overriding yaparken method signature name+parametre
 *  dokunulmaz
 * b) overrriding yaparken access modifier lar belli kurallara
 *  gore degistirilebilir
 * c)overriding yparken return type lar  belli kurallara 
 * gore degistirilebilr
 * d)overriding yaparken method budy degistirilir zaten overriding
 *  in amac� budur. ama method body yi degistirmeden kullan�rsan�z
 *   java cte vermez
 * e)overriding yapabilmek icin parent child relationship sarttit
 * yani inheritance olmadan overriding olmaz
 * f)oveeride edilen method parentteki meethoddur ve java o methodaa
 *  oveeridden method denir
 * child class daki method ise overriding method olarak adland�r�l�r
  3)overriding methodun bas�na @override annotation �n� koyarsaniz 
  java yapt�g�n�jz overriding i kontrol eder herhangi ir yanl�sl�k 
  varsa cte verir
  4)oveeriding methodun access modifier i ya overriden method ile 
  ayn� olur veya daha genis olur
 *5)return type lar primitive ise overridng methodun return type i 
 *overridden method ile ayno�olmals��r
 *6)oveeridden methodun return type i void ise overriding methodun da 
 *return type void olmalidir
 *7)return type wrapper class ise overriding methodun return type 
 *overridden method ile ayn� olmal�d�r
 *8)return typlar aras�nda parent child relationship varsa
 *overriding method un return typ i ya overridden method ile olmali 
 *veya overridden method un child class� olaml�
 *9)static methodlar override edilemezler
 *10)"polymorphism"nedir?
 *polymorphism overloading ve overridin den olusur
 *overloading public void add(){}
 *            public void add(int i){}
 *            public void add(int i,String s){}
 *overriding  public void multply(){syso 3*4}
 *            public void multply(){syso 1*2*3}
 *            public void multply(){syso 5*4*3}
 * overloading ve overriding aras�ndaki farklar
 * 1)overloading de method signature degistirlir. 
 * overridig de mthod signature a dokululmaz
 * 
 * 2)overloading de method body genellikle degistirilmez 
 * overriding de method body hemen hemen her zaman degiatirilir
 * 
 * 3)overloading de inheritance gerekmez 
 * overriding de inheritance sartt�r
 * 
 * 4)overloading compile time polymorphism dir 
 * overriding run time polymorphism dir
 * 
 * 5)private methodlar overload edilebilirle ama override edilemezler
 * static methodlar overload edilebilirler ama override edilemezler
 * final mehodlar overload edilebilirler ama override edilemzler
 **/
	}


