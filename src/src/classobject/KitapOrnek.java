package classobject;

import java.util.Scanner;

public class KitapOrnek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ka� tane kitap kaydedilecek:");
		int secim = sc.nextInt();

		Kitap kitapDizisi[] = new Kitap[secim];
		for (int i = 0; i < secim; i++) {

			Kitap kitap = new Kitap();
			System.out.print((i +1)+ ". kitab�n ismi:");
			kitap.kitapAd� = sc.next();
			System.out.print((i +1)+ ". kitab�n y�l�:");
			kitap.kitapYay�nY�l� = sc.nextInt();
			kitapDizisi[i] = kitap;
			System.out.println(kitapDizisi[i]);
		}
		for (int j = 0; j < secim; j++) {
			System.out.println((j+1)+". kitab�n �zellikleri:"+kitapDizisi[j]);
		}

	}

}
