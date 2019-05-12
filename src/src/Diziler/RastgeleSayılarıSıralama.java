package Diziler;

import java.util.Random;
import java.util.Scanner;

public class RastgeleSayýlarýSýralama {

	public static void main(String[] args) {
		Random rnd = new Random();

		Scanner sc = new Scanner(System.in);

		System.out.print("rastgele kaça kadar sayýlar seçilsin:");
		int secim = sc.nextInt();
		System.out.print("kaç tane sayý seçilsin:");
		int sayi = sc.nextInt();

		int kiyaslanacakSayi=0;
		
		for (int i = 0; i < sayi; i++) {
           
			int rastgeleSayi = rnd.nextInt(secim);
			System.out.println((i+1) +". sayý : "+rastgeleSayi);
			
			if(kiyaslanacakSayi<rastgeleSayi) {
				kiyaslanacakSayi=rastgeleSayi;
			}
			 System.out.println("þuanki en büyük sayý:"+kiyaslanacakSayi);
		}

		

	}

}
