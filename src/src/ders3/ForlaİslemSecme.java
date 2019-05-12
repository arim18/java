package ders3;

import java.util.Scanner;

public class ForlaÝslemSecme {

	public static void main(String[] args) {
		
for ( ; ; ) {
	System.out.println("-ÝÞLEM SEÇÝNÝZ-");
	System.out.println("1-)Faktöriyel Al");
	System.out.println("2-)Tek Sayýlarý Yazdýr");
	System.out.println("3-)Çýkýþ");
	
	
	Scanner sc=new Scanner(System.in);
	int secim=sc.nextInt();
	
	if(secim==3) {
		break;
	}
	
	switch (secim) {
	case 1:
		System.out.println("->iþlem yapýlacak sayýyý giriniz:");
		int sayi=sc.nextInt();
		int faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {

			faktoriyel=faktoriyel*i;
			
		}
		System.out.println("sonuc: "+faktoriyel);
		break;
	case 2:
		System.out.println("->iþlem yapýlacak sayýyý giriniz:");
		int sayi1=sc.nextInt();
		int i=1;
		
		while (i<sayi1) {
			
			System.out.println("(->"+i+"<-)");
			i=i+2;
		}
		
		break;
	

	default:
		System.out.println("geçerli deðer giriniz!!!");
		break;
	}
	
}
 
		
   
		

	}

}
