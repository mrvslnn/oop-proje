package dersTekrarı;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		// Bug�ne g�re kac g�n sonra hangi g�n oldu�unuz yazd�r�n�z.
	    // bugun hangi gun (scan)
	    // kac gun sonrasini ogrenmek istedigi (scan)
	    // out= (ornegin) pazartesi
		
       Scanner scan=new Scanner(System.in);
       System.out.println("bugun hangi gun giriniz");
       String str=scan.nextLine();
       
       System.out.println("kac gun sonrasini ogrenmek istiyorsunuz");
       int sayi=scan.nextInt();
       
     switch(str) { 
     case "cuma":
    	if (sayi%7==0) {
		System.out.println("cuma");
	}else if (sayi%7==1)  {
		System.out.println("cumartesi");
	}else if (sayi%7==2) {
		System.out.println("pazar");
	}else if (sayi%7==3) {
		System.out.println("pazartesi");
	}else if (sayi%7==4) {
		System.out.println("sali");
	}else if (sayi%7==5) {
		System.out.println("carsamba");
	}else if (sayi%7==6) {
		System.out.println("persembe");
	}else {
		System.out.println("gecerli bir sayi giriniz");
	}
    break;
    
	case "cumartesi":
    	if (sayi%7==0) {
		System.out.println("cumartesi");
	}else if (sayi%7==1)  {
		System.out.println("pazar");
	}else if (sayi%7==2) {
		System.out.println("pazartesi");
	}else if (sayi%7==3) {
		System.out.println("sali");
	}else if (sayi%7==4) {
		System.out.println("carsamba");
	}else if (sayi%7==5) {
		System.out.println("persembe");
	}else if (sayi%7==6) {
		System.out.println("cuma");
	}else {
		System.out.println("gecerli bir sayi giriniz");
	}
    break;
    
	case "pazar":
    	if (sayi%7==0) {
		System.out.println("pazar");
	}else if (sayi%7==1)  {
		System.out.println("pazartesi");
	}else if (sayi%7==2) {
		System.out.println("sali");
	}else if (sayi%7==3) {
		System.out.println("carsamba");
	}else if (sayi%7==4) {
		System.out.println("persembe");
	}else if (sayi%7==5) {
		System.out.println("cuma");
	}else if (sayi%7==7) {
		System.out.println("cumartesi");
	}else {
		System.out.println("gecerli bir sayi giriniz");
	}
    break;
    
	case "pazartesi":
    	if (sayi%7==0) {
		System.out.println("pazartesi");
	}else if (sayi%7==1)  {
		System.out.println("sali");
	}else if (sayi%7==2) {
		System.out.println("carsamba");
	}else if (sayi%7==3) {
		System.out.println("persembe");
	}else if (sayi%7==4) {
		System.out.println("cuma");
	}else if (sayi%7==5) {
		System.out.println("cumartesi");
	}else if (sayi%7==6) {
		System.out.println("pazar");
	}else {
		System.out.println("gecerli bir sayi giriniz");
	}
    break;
    
	case "sali":
    	if (sayi%7==0) {
		System.out.println("sali");
	}else if (sayi%7==1)  {
		System.out.println("carsamba");
	}else if (sayi%7==2) {
		System.out.println("persembe");
	}else if (sayi%7==3) {
		System.out.println("cuma");
	}else if (sayi%7==4) {
		System.out.println("cumartesi");
	}else if (sayi%7==5) {
		System.out.println("pazar");
	}else if (sayi%7==6) {
		System.out.println("pazartesi");
	}else {
		System.out.println("gecerli bir sayi giriniz");
	}
    break;
    
	case "carsamba":
    	if (sayi%7==0) {
		System.out.println("carsamba");
	}else if (sayi%7==1)  {
		System.out.println("persembe");
	}else if (sayi%7==2) {
		System.out.println("cuma");
	}else if (sayi%7==3) {
		System.out.println("pazar");
	}else if (sayi%7==4) {
		System.out.println("carsamba");
	}else if (sayi%7==5) {
		System.out.println("persembe");
	}else if (sayi%7==6) {
		System.out.println("cuma");
	}else {
		System.out.println("gecerli bir sayi giriniz");
	}
    break;
    
	case "persembe":
    	if (sayi%7==0) {
		System.out.println("persembe");
	}else if (sayi%7==1)  {
		System.out.println("cuma");
	}else if (sayi%7==2) {
		System.out.println("cumartesi");
	}else if (sayi%7==3) {
		System.out.println("pazar");
	}else if (sayi%7==4) {
		System.out.println("pazartesi");
	}else if (sayi%7==5) {
		System.out.println("sali");
	}else if (sayi%7==6) {
		System.out.println("carsamba");
	}else {
		System.out.println("gecerli bir sayi giriniz");
	}
    break;
    default:
}
}
}