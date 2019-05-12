package classobject;

import java.util.Scanner;

public class KitapOrnek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("kaç tane kitap kaydedilecek:");
		int secim = sc.nextInt();

		Kitap kitapDizisi[] = new Kitap[secim];
		for (int i = 0; i < secim; i++) {

			Kitap kitap = new Kitap();
			System.out.print((i +1)+ ". kitabýn ismi:");
			kitap.kitapAdý = sc.next();
			System.out.print((i +1)+ ". kitabýn yýlý:");
			kitap.kitapYayýnYýlý = sc.nextInt();
			kitapDizisi[i] = kitap;
			System.out.println(kitapDizisi[i]);
		}
		for (int j = 0; j < secim; j++) {
			System.out.println((j+1)+". kitabýn özellikleri:"+kitapDizisi[j]);
		}

	}

}
