package Diziler;

import java.util.Random;
import java.util.Scanner;

public class RastgeleSay�lar�S�ralama {

	public static void main(String[] args) {
		Random rnd = new Random();

		Scanner sc = new Scanner(System.in);

		System.out.print("rastgele ka�a kadar say�lar se�ilsin:");
		int secim = sc.nextInt();
		System.out.print("ka� tane say� se�ilsin:");
		int sayi = sc.nextInt();

		int kiyaslanacakSayi=0;
		
		for (int i = 0; i < sayi; i++) {
           
			int rastgeleSayi = rnd.nextInt(secim);
			System.out.println((i+1) +". say� : "+rastgeleSayi);
			
			if(kiyaslanacakSayi<rastgeleSayi) {
				kiyaslanacakSayi=rastgeleSayi;
			}
			 System.out.println("�uanki en b�y�k say�:"+kiyaslanacakSayi);
		}

		

	}

}
