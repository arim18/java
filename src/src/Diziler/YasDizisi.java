package Diziler;

import java.util.Scanner;

public class YasDizisi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("hakk�nda veri girilecek ��renci say�s�:");
		int secim = sc.nextInt();

		int yasDizisi[] = new int[secim];

		int yasToplam = 0;
		for (int i = 0; i < secim; i++) {
			System.out.print((i+1)+". ��rencinin ya��n� giriniz:");
			int yas = sc.nextInt();

			yasDizisi[i] = yas;

			yasToplam = yasToplam + yas;
		}

		System.out.print("ka��nc� ��rencinin ya��n� g�rmek istiyorsunuz:");
		int secim1 = sc.nextInt();

		System.out.println(yasDizisi[secim1-1]);

		System.out.println("ya�lar� toplam�:" + yasToplam);
		for (int j = 0; j < secim; j++) {
			System.out.println("ya� dizisinin "+ (j+1)+ ". eleman�:" + yasDizisi[j]);
		}
	}

}
