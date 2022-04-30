package dersler;

import java.util.Scanner;

public class Scanner_Sinifi {

	public static void main(String[] args) {
	
		// Kullanýcýdan string deðer alabilmek için Scanner sýnýfý kullandýk
		System.out.println("Part 1");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Mesaj giriniz: ");
		String mesaj = input.nextLine(); // String deðeri bruda alýyoruz
		System.out.println("Mesajýnýz: " + mesaj);
		
		System.out.println("\n");
		
		// Kullanýcýdan int deðer alabilmek için Scanner sýnýfý kullandýk
		System.out.println("Part 2");
		
		Scanner inputInt = new Scanner(System.in); 
		System.out.print("Lütfen ilk sayiyi giriniz: ");
		int sayi1 = inputInt.nextInt(); // int deðeri bruda alýyoruz
		System.out.print("Lütfen ikinci sayiyi giriniz: ");
		int sayi2 = inputInt.nextInt(); // int deðeri bruda alýyoruz
		System.out.println("Toplam: " +  (sayi1 + sayi2));
		
		/*
		 * Ýki örnekten gördüðümüz gibi nextLine() ile string deðerini,
		 * nextInt() ile int deðerini aldýk. Diðer tiplerde alabilmek için
		 * aþaðýdaki þekillerde kullanabiliriz.
		 * nextLine() -> String
		 * nextInt() -> Integer
		 * nextByte() -> Byte
		 * nextFloat() -> Float
		 * nextDouble -> Double
		 */
		
	}

}
