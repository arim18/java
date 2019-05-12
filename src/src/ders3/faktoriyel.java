package ders3;

import java.util.Scanner;

public class faktoriyel {

	public static void main(String[] args) {
		System.out.println("sayý:");

		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();

		int faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {

			faktoriyel=faktoriyel*i;
			
		}
		System.out.println("sonuc: "+faktoriyel);
	}

}
