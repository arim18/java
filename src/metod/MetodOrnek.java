package metod;

import java.util.Scanner;

public class MetodOrnek {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.Say�y� Giriniz: ");
		int sayi1 = scanner.nextInt();

		System.out.println("2.Say�y� Giriniz: ");
		int sayi2 = scanner.nextInt();

		System.out.println("�stedi�iniz ��lemi Yaz�n�z Ard�ndan Enter'a Bas�n�z:");
		System.out.println("B�lme ��in 1'e Bas�n�z");
		System.out.println("�arpma ��in 2'e Bas�n�z");
		System.out.println("Toplama ��in 3'e Bas�n�z");
		System.out.println("��karma ��in 4'e Bas�n�z");

		int secenek = scanner.nextInt();
		if (secenek == 1) {

			System.out.println("Sonu�: " + bol(sayi1,sayi2));
		} else if (secenek == 2) {
			int sonuc = (sayi1 * sayi2);
			System.out.println("Sonu�: " + carp(sayi1,sayi2));
		} else if (secenek == 3) {
			int sonuc = (sayi1 + sayi2);
			System.out.println("Sonu�: " + topla(sayi1,sayi2));
		} else if (secenek == 4) {
			int sonuc = (sayi1 - sayi2);
			System.out.println("Sonu�: " + c�kar(sayi1,sayi2));
		} else {
			System.out.println("Yanl�� De�er Girdiniz!!");
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
	private static float c�kar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}

}
