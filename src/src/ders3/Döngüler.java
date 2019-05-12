package ders3;

import java.util.Scanner;

public class Döngüler {

	public static void main(String[] args) {
	System.out.println("bir sayi giriniz  :  ");
	
	Scanner sc=new Scanner(System.in);
	int sayi= sc.nextInt();
	
	int i=1;
	
	while (i<sayi) {
		
		System.out.println("(->"+i+"<-)");
		i=i+2;
	}
	
		 
	}

}
