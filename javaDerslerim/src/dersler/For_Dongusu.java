package dersler;

import java.util.Iterator;

public class For_Dongusu {

	public static void main(String[] args) {
		
		
		// For Tan�m
		/*
		 * for (dongu_baslangic_degeri; dongu_kosulu; dongu_deger_degisimi;) {
			// ko�ula uygun kod blo�u
			
		} 
		 */
		
		System.out.println("***�rnek 1***");
		
		int i = 0;
		//For d�ng�s� kullanmadan
		System.out.println("Deger: " + i);
		System.out.println("Deger: " + (i+1));
		System.out.println("Deger: " + (i+2));
		System.out.println("Deger: " + (i+3));
		System.out.println("Deger: " + (i+4));
		System.out.println("Deger: " + (i+5));
		System.out.println("Deger: " + (i+6));
		System.out.println("Deger: " + (i+7));
		System.out.println("Deger: " + (i+8));
		System.out.println("Deger: " + (i+9));
		
		System.out.println("\n");
		
		// For d�ng�s� kullanarak
		for (i = 0; i < 10; i++) {
			System.out.println("DegerFor: " + i);
			
		}
		
		System.out.println("\n***�rnek 2***");
		
		// Standart kullan�m
		System.out.print("f: ");
		for (int f = 0; f < 10; f++) {
			System.out.print(f + " ");
		}
		
		// Azaltarak kullan�m
		System.out.print("\nu: ");
		for (int u = 10; u >= 0; u--) {
			System.out.print(u + " ");
		}
		
		// 5'ten 10'a kadar
		System.out.print("\ne: ");
		for (int e = 5; e <= 10; e++) {
			System.out.print(e + " ");
		}
		
		// 0'dan 100'e kadar 10'ar 10'ar
		System.out.print("\nk: ");
		for (int k = 0; k <= 100; k+=10) {
			System.out.print(k + " ");
		}
		
		// 50'den 0'a 5'er 5'er
		System.out.print("\ns: ");
		for (int s = 50; s >= 0; s-=5) {
			System.out.print(s + " ");
		}

		System.out.println("\n***�rnek 3***");
		// �� i�e d�ng�
		
		for (int j = 0; j < 10; j++) {
			System.out.println("j: " + j);
			for (int m = 10; m > 0; m--) {
				System.out.println("j: " + j + " m: " + m);
				
			}
			
		}
		
		System.out.println("\n***�rnek 4***");
		// Sonsuz d�ng�
		
		// ��ARET� KALDIRIP DENEYEB�L�RS�N�Z...
		// for(; ;) {
		//	 System.out.println("Ufuk Enes KURT ~ UEKAPPS");
		// }
		
	}

}
