package dersler;

public class Do_While_Dongusu {

	public static void main(String[] args) {
		/*
		 * do while d�ng�s� ile while d�ng�s� aras�ndaki fark nedir? Bu sorunun en 
		 * basit cevab�, while d�ng�s�ne verilen ifade do�ru de�il ise kod while
		 * d�ng�s� i�erisine hi� girmeden sonraki sat�r ile i�lemlere devam eder,
		 * do while d�ng�s�nde ise ifadenin do�ru olup olmamas�na bakmaks�z�n 
		 * d�ng� bir sefer �al���r.
		 */
		
		System.out.println("Part 1");
		
		int count = 1;
		while (count < 11) {
			System.out.println("Count is: " + count);
			count++;
		}
		
		int doCount = 1;
		do {
			System.out.println("DoCount is: " + doCount);
			doCount++;
		} while (doCount < 11);
		
		/*
		 * Burada while d�ng�s� �nce d�ng�ye girip sonra yazarken do while d�ng�s�nden
		 * �nce yaz�p sonraya d�ng�ye girilmektedir.
		 * 
		 * do while d�ng�s�n� bir kodun kesin bir kez �al��mas� gerekti�i yerlerde kullan�labilir
		 */
		
		System.out.println("\n");
		System.out.println("Part 2");
		
		int sayi = 11;
		while (sayi < 11) {
			System.out.println("Sayi is: " + sayi);
			sayi++;
		}
		
		int doSayi = 11;
		do {
			System.out.println("DoSayi is: " + doSayi);
			doSayi++;
		} while (doSayi < 11);

	}

}
