package Diziler;

import java.util.Scanner;

public class YasDizisi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("hakkýnda veri girilecek öðrenci sayýsý:");
		int secim = sc.nextInt();

		int yasDizisi[] = new int[secim];

		int yasToplam = 0;
		for (int i = 0; i < secim; i++) {
			System.out.print((i+1)+". öðrencinin yaþýný giriniz:");
			int yas = sc.nextInt();

			yasDizisi[i] = yas;

			yasToplam = yasToplam + yas;
		}

		System.out.print("kaçýncý öðrencinin yaþýný görmek istiyorsunuz:");
		int secim1 = sc.nextInt();

		System.out.println(yasDizisi[secim1-1]);

		System.out.println("yaþlarý toplamý:" + yasToplam);
		for (int j = 0; j < secim; j++) {
			System.out.println("yaþ dizisinin "+ (j+1)+ ". elemaný:" + yasDizisi[j]);
		}
	}

}
