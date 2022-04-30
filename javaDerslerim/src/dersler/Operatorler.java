package dersler;

public class Operatorler {

	public static void main(String[] args) {
		// Basit Atama Operatörü
		/*
		 * Basit atama operatörleri kod geliþtirmeye ilk baþladýðýmýz
		 * andan itibaren kullandýðýmýz ve (=) ile gösterilen operatördür.
		 * Bu operatöre yazdýðýmýz kodlarda deðiþkenlere deðer atarken
		 * kullandýðýmýz operatörü örnek verebiliriz.
		 * int intDeger = 1453;
		 * String strDeger = "UEKAPPS";
		 */
		
		System.out.println("***Aritmetik Operatörler***");
		// Aritmetik Operatörler
		/*
		 * Aritmetik operatörler klasik matematiksel iþlemleri yapýlmasýný
		 * saðlayan operatörlerdir. +(toplama), -(çýkarma), *(çarpma), 
		 * (bölme) ve %(mod alma) iþlemlerinin yapýlmasýný saðlayan operatörlerdir.
		 */
		
		int deger1 = 66;
		int deger2 = 23;
			
		int toplama = deger1 + deger2;
		int cikarma = deger1 - deger2;
		int carpma = deger1 * deger2;
		int bolme= deger1 / deger2;
		int mod = deger1 % deger2;
		
		System.out.println("Toplama Sonuç: " + toplama);
		System.out.println("Çýkarma Sonuç: " + cikarma);
		System.out.println("Çarpma Sonuç: " + carpma);
		System.out.println("Bölme Sonuç: " + bolme);
		System.out.println("Mod Sonuç: " + mod);
		
		System.out.println("\n");
		
		System.out.println("***Tekli Operatörler***");
		//Tekli Operatörler
		/*
		 * Tekli operatörler bir deðiþkenin saðýna veya soluna gelerek tek baþýna
		 * deðiþkenin deðerini deðiþtirebilen operatörlerdir. +(artý), -(eksi), 
		 * ++(1 deðer arttýrma), --(1 deðer düþürme), !(boolean tipi tersine çevirme)
		 * operatörleri mevcuttur.
		 */
		
		int deger = +1;
		
		System.out.println("Deðer: " + deger);
		
		// eksiye çevirme
		deger = -deger;
		System.out.println("Deðer: " + deger);
		
		// +1 ekle
		deger++;
		System.out.println("Deðer: " + deger);
		
		// -1 çýkar
		deger--;
		System.out.println("Deðer: " + deger);
		
		boolean durum = true;
		
		System.out.println("Durum: " + durum);
		
		System.out.println("Durum: " + !durum);
		
		System.out.println("\n");
		
		System.out.println("***Eþitlik ve Ýliþkisel Operatörler***");
		/*
		 * Eþitlik ve Ýliþkisel operatörler iki farklý deðiþkenin eþitliðini veya
		 * arasýndaki iliþkiye yönelik farklýlýklarý ortaya çýkarmaya yarayan operatörlerdir.
		 * ==(eþittir), !=(eþit deðildir), >(büyüktür), <(küçüktür), >=(büyük eþittir),
		 * <=(küçük eþittir) operatörlerinden oluþur.
		 */
		
		int sayi1 = 26;
		int sayi2 = 26;
		
		if(sayi1 == sayi2) {
			System.out.println(sayi1 + " eþittir " + sayi2);
		}
		
		int sayi3 = 26;
		int sayi4 = 28;
		
		if(sayi3 != sayi4) {
			System.out.println(sayi3 + " eþit deðildir " + sayi4);
		}
		
		if(sayi3 < sayi4) {
			System.out.println(sayi3 + " küçüktür " + sayi4);
		}
		
		if(sayi3 <= sayi4) {
			System.out.println(sayi3 + " küçük veya eþittir " + sayi4);
		}
		
		int sayi5 = 26;
		int sayi6 = 13;
		
		if(sayi5 > sayi6) {
			System.out.println(sayi5 + " büyüktür " + sayi6);
		}
		
		int sayi7 = 15;
		int sayi8 = 15;
		
		if(sayi7 >= sayi8) {
			System.out.println(sayi7 + " büyük veya eþittir " + sayi8);
		} 
		
		System.out.println("\n");
		
		System.out.println("***Koþul Operatörleri***");
		/*
		 * Koþul operatörleri verilen parametrelerin birden fazla eþitlik veya iliþkisel
		 * koþulu saðlayýp saðlamadýðýný kontrol ederken kullanýlýr. &&(ve), ||(veya),
		 * ?:(üçlü) operatör seçenekleri mevcuttur.
		 */
		
		int f1 = 2;
		int f2 = 4;
		String strDeger1 = "uekapps";
		String strDeger2 = "uekapps";
		
		if((f1 < f2) && (strDeger1.contains(strDeger2))) {
			System.out.println(f1 + " küçüktür " + f2
					+ " ve " + strDeger1 + " içinde " + strDeger2 + 
					" String deðerini içermektedir.");
		} 
		
		if((f1 == f2) || (strDeger1.contains(strDeger2))) {
			System.out.println(f1 + " eþittir " + f2
					+ " veya " + strDeger1 + " içinde " + strDeger2 + 
					" String deðerini içermektedir.");
		}
		
		if((f1 < f2) || (strDeger1.equals(strDeger2))) {
			System.out.println(f1 + " küçüktür " + f2
					+ " veya " + strDeger1 + " içinde " + strDeger2 + 
					" String deðerini içermektedir.");
		}
		
		int f3 = 23;
		
		// f3 23'e eþitse f4'ün deðerini 24 yap deðilse 22 yap
		int f4 = (f3 == 23) ? 24 : 22;
		System.out.println("f4: " + f4);
		
		// f3 22'ye eþitse f4'ün deðerini 24 yap deðilse 22 yap
		f4 = (f3 == 24) ? 24 : 22;
		System.out.println("f4: " + f4);
		
		System.out.println("\n");
		
		System.out.println("***Karþýlaþtýrma Operatörleri***");
		/*
		 * Karþýlaþtýrma operaötrü insteadOf olarak bilinmektedir. Bir sýnýfý
		 * bir sýnýfla veya interface ile karþýlaþtýrma yaparken kullanýlmaktadýr.
		 */
		Parent obj1 = new Parent();
		Parent obj2 = new Child();
		
		System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));
		System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));
		System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
		
		System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));
		System.out.println("obj1 instanceof Child: " + (obj2 instanceof Child));
		System.out.println("obj1 instanceof MyInterface: " + (obj2 instanceof MyInterface));
		
		
	}

}

// Nesne yönelimli programlama bilmek gerektirdiði için üzerinde çok durmayacaðým.
	class Parent {}
	class Child extends Parent implements MyInterface {}
	interface MyInterface {}
