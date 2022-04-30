package dersler;

import java.util.Scanner;

public class Scanner_Sinifi {

	public static void main(String[] args) {
	
		// Kullan�c�dan string de�er alabilmek i�in Scanner s�n�f� kulland�k
		System.out.println("Part 1");
		
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen Mesaj giriniz: ");
		String mesaj = input.nextLine(); // String de�eri bruda al�yoruz
		System.out.println("Mesaj�n�z: " + mesaj);
		
		System.out.println("\n");
		
		// Kullan�c�dan int de�er alabilmek i�in Scanner s�n�f� kulland�k
		System.out.println("Part 2");
		
		Scanner inputInt = new Scanner(System.in); 
		System.out.print("L�tfen ilk sayiyi giriniz: ");
		int sayi1 = inputInt.nextInt(); // int de�eri bruda al�yoruz
		System.out.print("L�tfen ikinci sayiyi giriniz: ");
		int sayi2 = inputInt.nextInt(); // int de�eri bruda al�yoruz
		System.out.println("Toplam: " +  (sayi1 + sayi2));
		
		/*
		 * �ki �rnekten g�rd���m�z gibi nextLine() ile string de�erini,
		 * nextInt() ile int de�erini ald�k. Di�er tiplerde alabilmek i�in
		 * a�a��daki �ekillerde kullanabiliriz.
		 * nextLine() -> String
		 * nextInt() -> Integer
		 * nextByte() -> Byte
		 * nextFloat() -> Float
		 * nextDouble -> Double
		 */
		
	}

}
