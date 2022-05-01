package dersler;

public class While_Dongusu {

	public static void main(String[] args) {
		
		/*
		 * Kod yazarken bazý satýrlarý birden fazla defa
		 * çalýþtýrmamýz gerekebilir. Çok basit bir örnekle
		 * "Merhaba UEKAPPS" yazýsýný konsola 10 defa alt alta
		 * yazdýrmamýz gerekti. Bunu aþaðýdaki gibi yapabiliriz. 
		 */
		
		System.out.println("***Örnek 1***");
		
		System.out.println("Merhaba UEKAPPS");
		System.out.println("Merhaba UEKAPPS");
		System.out.println("Merhaba UEKAPPS");
		System.out.println("Merhaba UEKAPPS");
		System.out.println("Merhaba UEKAPPS");
		System.out.println("Merhaba UEKAPPS");
		System.out.println("Merhaba UEKAPPS");
		System.out.println("Merhaba UEKAPPS");
		System.out.println("Merhaba UEKAPPS");
		System.out.println("Merhaba UEKAPPS");
		
		/*
		 * 10 tane yazdýrmak için üstteki kodu kullanýlabilirsiniz, ancak
		 * düþünün ki 1000 adet istendi veya herhangi bir koþula baðlanmasý
		 * istendi. Ýþte bu durumlarda Java bize çok kullanýþlý bir yapý olan
		 * döngü yapýsýný sunmaktadýr. 3 adet döngü çeþidi vardýr. While döngüsü,
		 * do-while döngüsü ve for döngüsü. Bu 3 döngü arasýnda en çok kullanýlan
		 * döngü çeþidi for döngüsüdür.
		 */
		
		System.out.println("\n");
		System.out.println("***Örnek 1 Döngü ile kullanýmý***");
		
		int i = 0;
		// i 10 dan küçük olduðu müddteçe true dönecektir ve while kod bloðuna girecektir
		while (i<10) {
			System.out.println("Merhaba UEKAPPS");
			i++;
		}
		
		System.out.println("\n");
		System.out.println("***Örnek 2***");
		
		// 1 den 20 ye kadar olan sayýlarýn toplamýný bulma
		int toplam = 0;
		int k = 0;
		
		while (k < 20) {
			toplam = toplam + k;
			k++;
		}
		
		System.out.println("Toplam= " + toplam);

	}

}
