package dersler;

public class Break_Continue_Deyimleri {

	public static void main(String[] args) {
		/*
		 * break continue deyimleri arasýnda break deyimi
		 * daha önceden anlattýðýmýz for, while ve do-while
		 * döngüleriyle birlikte kullanýlabilir. Break deyimi
		 * döngülerden ansýzýn çýkmanýzý ve döngüyü istediðiniz
		 * durumlarda sonlandýrmanýzý saðlamaktadýr. Örneðin,
		 * bir veritabanýndan tüm id deðerlerini çektiniz ve
		 * id deðerlerinden ilk 10 tanesini listeleyeceksiniz.
		 * Eðer elnizide 10'dan fazla kayýt varsa döngüyü bir
		 * þekilde sonlandýrmanýz gerektmektedir. Bu örneði bir de kod ile anlatalým;
		 */
		
		System.out.println("***Örnek***");
		
		int veritabaniKayitSayisi = 35;
		
		for (int i = 1; i < veritabaniKayitSayisi; i++) {
			System.out.println(i + ". kayýt");
			if (i == 10) {
				break;
			}
			
		}
		
		System.out.println("\n***Örnek 2***");
		
		int veritabaniKayitSayisi2 = 35;
		int count = 1;
		
		while (veritabaniKayitSayisi2 >= 0) {
			System.out.println(count + ". kayýt");
			if (count == 10) {
				break;
			}
			count++;
			veritabaniKayitSayisi2--;
		}
		
		System.out.println("\n***Örnek 3***");
		/*
		 * break continue deyimleri arasýnda continue deyimi
		 * yine break deyiminde olduðu gibi for, while ve 
		 * do-while döngülerinde kullanýlmaktadýr. Break
		 * deyiminden farklý olarak continue döngüyü sonlandýrmamakta
		 * fakat döngüde ilgili tekrarý atlamaktadýr. Örneðin
		 * bir veritabanýndan yine tüm kayýtlarýný çektiniz ve
		 * bu kayýtlar arasýndan 6. kayýdý atlamak istiyor ve
		 * döngünün devam etmesini istiyorsunuz. Bu gibi durumlarda
		 * continue kullanýlabilecek en güzel tercihtir.
		 */
		
		int veritabaniKayitSayisi3 = 15;
		
		for (int i = 1; i <= veritabaniKayitSayisi3; i++) {
			if (i == 6) {
				continue;
			}
			System.out.println(i + ". kayýt");
			}
		
	}

}
