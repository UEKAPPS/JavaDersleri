package dersler;

import java.util.Scanner;

public class While_SayiTahminEtme {

	public static void main(String[] args) {
		
		// Math.random() ile �retti�imiz random bir sway�y� tahmin etme
		int sayi = (int)(Math.random() * 101);
		// 0 ile 100 aras�nda bir say� �retir 100'de olabilir
		
		Scanner input = new Scanner(System.in);
		// Kullan�c�dan say� alabilmek i�in Scanner s�n�f�n� kulland�k
		
		int tahmin = -1;
		// 0 ile 100 aras�nda olmas� i�in -1 verdik
		
		while (sayi != tahmin) {
			// Say� tahmine e�it olmad��� s�rece true d�necek ve bu i�lem tekrarlanacak
			// Say� i�leme e�it oldu�unda false d�necek ve d�ng�ye girmeyecek
			
			System.out.print("Tahmin etti�iniz say�y� giriniz: ");
			
			tahmin = input.nextInt();
			// Say� kullan�c�dan al�n�r
			
			if (tahmin == sayi) {
				System.out.println("Do�ru tahmin �atal-B��ak seti kazand�n�z!");
				
			} else if (tahmin > sayi){
				System.out.println("Tahmininizi Azalt�n");
				
			} else {
				System.out.println("Tahmininizi Artt�r�n");
			}
		}
		/*
		 * Yukar�daki kodu a��klamak gerekirse kod �al���r �al��maz 0 ile 100
		 * aras�nda bir say�y� random olarak olu�turuyor. Sonras�nda while
		 * d�ng�s� i�inde kullan�c�dan klavyeden tahmin girmesini istiyor. E�er
		 * bu tahmin random olu�turulan say�ya e�itse "Do�ru tahmin", b�y�kse
		 * "Tahmininizi Azalt�n", k���kse "Tahmininizi Artt�r�n" mesaj� veriyor.
		 * Girilen tahmin zaten say�ya e�itse "Do�ru tahmin" mesaj� verildikten
		 * sonra sayi != tahmin ko�ulunu sa�lamayaca�� i�in tekrardan d�ng�ye
		 * girmeyecek ve bu kodumuzda ba�ka i�lem olmad��� i�in program�m�z� sonland�racakt�r.
		 */
		
	}

}
