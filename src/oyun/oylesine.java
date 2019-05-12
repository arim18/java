package oyun;

import java.util.Scanner;

public class oylesine {

	public static void main(String[] args) {
		System.out.println("baslanacak sayi  :  ");

		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();

		System.out.println("BÝLGÝSAYAR mi baslasýn SEN mi:");
		String oyuncu = sc.next();
		int x = 10;
		if (oyuncu.equals("bilgisayar")) {
			x = 1;

		} else if (oyuncu.equals("ben")) {
			x = 0;

		}
		int gosterge = 1;
		while (0 < sayi) {
			int mod = x % 2;
			if (mod == 1) {
				if (sayi % 3 == 1) {
					int next = sayi - 1;
					System.out.println("bilgisayarýn sayýsý:" + next);
					if (sayi == 0) {
						System.out.println("TEBRÝKLER KAZANDINIZ!!!");
					}
					sayi = next;
				}
				else if (sayi % 3 == 0) {
					int next = sayi - 2;
					System.out.println("bilgisayarýn sayýsý:" + next);
					sayi = next;
					System.out.println("TEBRÝKLER KAZANDINIZ!!!");
				}
				else {
					int next = sayi - 1;
					System.out.println("bilgisayarýn sayýsý:" + next);
					sayi = next;
					System.out.println("TEBRÝKLER KAZANDINIZ!!!");
				}
				x = x + gosterge;
			} 
			else if (mod == 0) {
				System.out.println("eksiltme miktarý 1 mi 2 mi:");
				int eksiltme = sc.nextInt();
				
				if (eksiltme != 2 && eksiltme != 1) {

					System.out.println("->sadece 2 veya 1 çýkarabilirsiniz!!!");
					System.out.println("eksiltme miktarý 1 mi 2 mi:");
					int eksiltme1 = sc.nextInt();
					sayi = sayi - eksiltme1;
					System.out.println("sayýnýz:" + sayi);
					x = x + gosterge;
				}
				sayi = sayi - eksiltme;

				x = x + gosterge;
				System.out.println("sayýnýz:" + sayi);
				
				if (sayi == 0) {
					System.out.println("malesef kaybettiniz!!!");
				}
			}

		}

	}

}
