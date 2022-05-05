package dersler;

public class Break_Continue_Deyimleri {

	public static void main(String[] args) {
		/*
		 * break continue deyimleri aras�nda break deyimi
		 * daha �nceden anlatt���m�z for, while ve do-while
		 * d�ng�leriyle birlikte kullan�labilir. Break deyimi
		 * d�ng�lerden ans�z�n ��kman�z� ve d�ng�y� istedi�iniz
		 * durumlarda sonland�rman�z� sa�lamaktad�r. �rne�in,
		 * bir veritaban�ndan t�m id de�erlerini �ektiniz ve
		 * id de�erlerinden ilk 10 tanesini listeleyeceksiniz.
		 * E�er elnizide 10'dan fazla kay�t varsa d�ng�y� bir
		 * �ekilde sonland�rman�z gerektmektedir. Bu �rne�i bir de kod ile anlatal�m;
		 */
		
		System.out.println("***�rnek***");
		
		int veritabaniKayitSayisi = 35;
		
		for (int i = 1; i < veritabaniKayitSayisi; i++) {
			System.out.println(i + ". kay�t");
			if (i == 10) {
				break;
			}
			
		}
		
		System.out.println("\n***�rnek 2***");
		
		int veritabaniKayitSayisi2 = 35;
		int count = 1;
		
		while (veritabaniKayitSayisi2 >= 0) {
			System.out.println(count + ". kay�t");
			if (count == 10) {
				break;
			}
			count++;
			veritabaniKayitSayisi2--;
		}
		
		System.out.println("\n***�rnek 3***");
		/*
		 * break continue deyimleri aras�nda continue deyimi
		 * yine break deyiminde oldu�u gibi for, while ve 
		 * do-while d�ng�lerinde kullan�lmaktad�r. Break
		 * deyiminden farkl� olarak continue d�ng�y� sonland�rmamakta
		 * fakat d�ng�de ilgili tekrar� atlamaktad�r. �rne�in
		 * bir veritaban�ndan yine t�m kay�tlar�n� �ektiniz ve
		 * bu kay�tlar aras�ndan 6. kay�d� atlamak istiyor ve
		 * d�ng�n�n devam etmesini istiyorsunuz. Bu gibi durumlarda
		 * continue kullan�labilecek en g�zel tercihtir.
		 */
		
		int veritabaniKayitSayisi3 = 15;
		
		for (int i = 1; i <= veritabaniKayitSayisi3; i++) {
			if (i == 6) {
				continue;
			}
			System.out.println(i + ". kay�t");
			}
		
	}

}
