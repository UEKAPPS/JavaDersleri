package dersler;

public class Do_While_Dongusu {

	public static void main(String[] args) {
		/*
		 * do while döngüsü ile while döngüsü arasýndaki fark nedir? Bu sorunun en 
		 * basit cevabý, while döngüsüne verilen ifade doðru deðil ise kod while
		 * döngüsü içerisine hiç girmeden sonraki satýr ile iþlemlere devam eder,
		 * do while döngüsünde ise ifadenin doðru olup olmamasýna bakmaksýzýn 
		 * döngü bir sefer çalýþýr.
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
		 * Burada while döngüsü önce döngüye girip sonra yazarken do while döngüsünden
		 * önce yazýp sonraya döngüye girilmektedir.
		 * 
		 * do while döngüsünü bir kodun kesin bir kez çalýþmasý gerektiði yerlerde kullanýlabilir
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
