package dersler;

public class Operatorler {

	public static void main(String[] args) {
		// Basit Atama Operat�r�
		/*
		 * Basit atama operat�rleri kod geli�tirmeye ilk ba�lad���m�z
		 * andan itibaren kulland���m�z ve (=) ile g�sterilen operat�rd�r.
		 * Bu operat�re yazd���m�z kodlarda de�i�kenlere de�er atarken
		 * kulland���m�z operat�r� �rnek verebiliriz.
		 * int intDeger = 1453;
		 * String strDeger = "UEKAPPS";
		 */
		
		System.out.println("***Aritmetik Operat�rler***");
		// Aritmetik Operat�rler
		/*
		 * Aritmetik operat�rler klasik matematiksel i�lemleri yap�lmas�n�
		 * sa�layan operat�rlerdir. +(toplama), -(��karma), *(�arpma), 
		 * (b�lme) ve %(mod alma) i�lemlerinin yap�lmas�n� sa�layan operat�rlerdir.
		 */
		
		int deger1 = 66;
		int deger2 = 23;
			
		int toplama = deger1 + deger2;
		int cikarma = deger1 - deger2;
		int carpma = deger1 * deger2;
		int bolme= deger1 / deger2;
		int mod = deger1 % deger2;
		
		System.out.println("Toplama Sonu�: " + toplama);
		System.out.println("��karma Sonu�: " + cikarma);
		System.out.println("�arpma Sonu�: " + carpma);
		System.out.println("B�lme Sonu�: " + bolme);
		System.out.println("Mod Sonu�: " + mod);
		
		System.out.println("\n");
		
		System.out.println("***Tekli Operat�rler***");
		//Tekli Operat�rler
		/*
		 * Tekli operat�rler bir de�i�kenin sa��na veya soluna gelerek tek ba��na
		 * de�i�kenin de�erini de�i�tirebilen operat�rlerdir. +(art�), -(eksi), 
		 * ++(1 de�er artt�rma), --(1 de�er d���rme), !(boolean tipi tersine �evirme)
		 * operat�rleri mevcuttur.
		 */
		
		int deger = +1;
		
		System.out.println("De�er: " + deger);
		
		// eksiye �evirme
		deger = -deger;
		System.out.println("De�er: " + deger);
		
		// +1 ekle
		deger++;
		System.out.println("De�er: " + deger);
		
		// -1 ��kar
		deger--;
		System.out.println("De�er: " + deger);
		
		boolean durum = true;
		
		System.out.println("Durum: " + durum);
		
		System.out.println("Durum: " + !durum);
		
		System.out.println("\n");
		
		System.out.println("***E�itlik ve �li�kisel Operat�rler***");
		/*
		 * E�itlik ve �li�kisel operat�rler iki farkl� de�i�kenin e�itli�ini veya
		 * aras�ndaki ili�kiye y�nelik farkl�l�klar� ortaya ��karmaya yarayan operat�rlerdir.
		 * ==(e�ittir), !=(e�it de�ildir), >(b�y�kt�r), <(k���kt�r), >=(b�y�k e�ittir),
		 * <=(k���k e�ittir) operat�rlerinden olu�ur.
		 */
		
		int sayi1 = 26;
		int sayi2 = 26;
		
		if(sayi1 == sayi2) {
			System.out.println(sayi1 + " e�ittir " + sayi2);
		}
		
		int sayi3 = 26;
		int sayi4 = 28;
		
		if(sayi3 != sayi4) {
			System.out.println(sayi3 + " e�it de�ildir " + sayi4);
		}
		
		if(sayi3 < sayi4) {
			System.out.println(sayi3 + " k���kt�r " + sayi4);
		}
		
		if(sayi3 <= sayi4) {
			System.out.println(sayi3 + " k���k veya e�ittir " + sayi4);
		}
		
		int sayi5 = 26;
		int sayi6 = 13;
		
		if(sayi5 > sayi6) {
			System.out.println(sayi5 + " b�y�kt�r " + sayi6);
		}
		
		int sayi7 = 15;
		int sayi8 = 15;
		
		if(sayi7 >= sayi8) {
			System.out.println(sayi7 + " b�y�k veya e�ittir " + sayi8);
		} 
		
		System.out.println("\n");
		
		System.out.println("***Ko�ul Operat�rleri***");
		/*
		 * Ko�ul operat�rleri verilen parametrelerin birden fazla e�itlik veya ili�kisel
		 * ko�ulu sa�lay�p sa�lamad���n� kontrol ederken kullan�l�r. &&(ve), ||(veya),
		 * ?:(��l�) operat�r se�enekleri mevcuttur.
		 */
		
		int f1 = 2;
		int f2 = 4;
		String strDeger1 = "uekapps";
		String strDeger2 = "uekapps";
		
		if((f1 < f2) && (strDeger1.contains(strDeger2))) {
			System.out.println(f1 + " k���kt�r " + f2
					+ " ve " + strDeger1 + " i�inde " + strDeger2 + 
					" String de�erini i�ermektedir.");
		} 
		
		if((f1 == f2) || (strDeger1.contains(strDeger2))) {
			System.out.println(f1 + " e�ittir " + f2
					+ " veya " + strDeger1 + " i�inde " + strDeger2 + 
					" String de�erini i�ermektedir.");
		}
		
		if((f1 < f2) || (strDeger1.equals(strDeger2))) {
			System.out.println(f1 + " k���kt�r " + f2
					+ " veya " + strDeger1 + " i�inde " + strDeger2 + 
					" String de�erini i�ermektedir.");
		}
		
		int f3 = 23;
		
		// f3 23'e e�itse f4'�n de�erini 24 yap de�ilse 22 yap
		int f4 = (f3 == 23) ? 24 : 22;
		System.out.println("f4: " + f4);
		
		// f3 22'ye e�itse f4'�n de�erini 24 yap de�ilse 22 yap
		f4 = (f3 == 24) ? 24 : 22;
		System.out.println("f4: " + f4);
		
		System.out.println("\n");
		
		System.out.println("***Kar��la�t�rma Operat�rleri***");
		/*
		 * Kar��la�t�rma opera�tr� insteadOf olarak bilinmektedir. Bir s�n�f�
		 * bir s�n�fla veya interface ile kar��la�t�rma yaparken kullan�lmaktad�r.
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

// Nesne y�nelimli programlama bilmek gerektirdi�i i�in �zerinde �ok durmayaca��m.
	class Parent {}
	class Child extends Parent implements MyInterface {}
	interface MyInterface {}
