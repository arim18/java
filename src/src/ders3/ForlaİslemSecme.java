package ders3;

import java.util.Scanner;

public class Forla�slemSecme {

	public static void main(String[] args) {
		
for ( ; ; ) {
	System.out.println("-��LEM SE��N�Z-");
	System.out.println("1-)Fakt�riyel Al");
	System.out.println("2-)Tek Say�lar� Yazd�r");
	System.out.println("3-)��k��");
	
	
	Scanner sc=new Scanner(System.in);
	int secim=sc.nextInt();
	
	if(secim==3) {
		break;
	}
	
	switch (secim) {
	case 1:
		System.out.println("->i�lem yap�lacak say�y� giriniz:");
		int sayi=sc.nextInt();
		int faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {

			faktoriyel=faktoriyel*i;
			
		}
		System.out.println("sonuc: "+faktoriyel);
		break;
	case 2:
		System.out.println("->i�lem yap�lacak say�y� giriniz:");
		int sayi1=sc.nextInt();
		int i=1;
		
		while (i<sayi1) {
			
			System.out.println("(->"+i+"<-)");
			i=i+2;
		}
		
		break;
	

	default:
		System.out.println("ge�erli de�er giriniz!!!");
		break;
	}
	
}
 
		
   
		

	}

}
