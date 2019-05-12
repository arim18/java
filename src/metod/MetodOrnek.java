package metod;

import java.util.Scanner;

public class MetodOrnek {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.Sayýyý Giriniz: ");
		int sayi1 = scanner.nextInt();

		System.out.println("2.Sayýyý Giriniz: ");
		int sayi2 = scanner.nextInt();

		System.out.println("Ýstediðiniz Ýþlemi Yazýnýz Ardýndan Enter'a Basýnýz:");
		System.out.println("Bölme Ýçin 1'e Basýnýz");
		System.out.println("Çarpma Ýçin 2'e Basýnýz");
		System.out.println("Toplama Ýçin 3'e Basýnýz");
		System.out.println("Çýkarma Ýçin 4'e Basýnýz");

		int secenek = scanner.nextInt();
		if (secenek == 1) {

			System.out.println("Sonuç: " + bol(sayi1,sayi2));
		} else if (secenek == 2) {
			int sonuc = (sayi1 * sayi2);
			System.out.println("Sonuç: " + carp(sayi1,sayi2));
		} else if (secenek == 3) {
			int sonuc = (sayi1 + sayi2);
			System.out.println("Sonuç: " + topla(sayi1,sayi2));
		} else if (secenek == 4) {
			int sonuc = (sayi1 - sayi2);
			System.out.println("Sonuç: " + cýkar(sayi1,sayi2));
		} else {
			System.out.println("Yanlýþ Deðer Girdiniz!!");
		}

	}

	private static float bol(int sayi1, int sayi2) {
		return (float)sayi1 / sayi2;
	}
	private static int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	private static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	private static float cýkar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}

}
