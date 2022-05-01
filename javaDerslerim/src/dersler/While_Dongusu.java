package dersler;

public class While_Dongusu {

	public static void main(String[] args) {
		
		/*
		 * Kod yazarken baz� sat�rlar� birden fazla defa
		 * �al��t�rmam�z gerekebilir. �ok basit bir �rnekle
		 * "Merhaba UEKAPPS" yaz�s�n� konsola 10 defa alt alta
		 * yazd�rmam�z gerekti. Bunu a�a��daki gibi yapabiliriz. 
		 */
		
		System.out.println("***�rnek 1***");
		
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
		 * 10 tane yazd�rmak i�in �stteki kodu kullan�labilirsiniz, ancak
		 * d���n�n ki 1000 adet istendi veya herhangi bir ko�ula ba�lanmas�
		 * istendi. ��te bu durumlarda Java bize �ok kullan��l� bir yap� olan
		 * d�ng� yap�s�n� sunmaktad�r. 3 adet d�ng� �e�idi vard�r. While d�ng�s�,
		 * do-while d�ng�s� ve for d�ng�s�. Bu 3 d�ng� aras�nda en �ok kullan�lan
		 * d�ng� �e�idi for d�ng�s�d�r.
		 */
		
		System.out.println("\n");
		System.out.println("***�rnek 1 D�ng� ile kullan�m�***");
		
		int i = 0;
		// i 10 dan k���k oldu�u m�ddte�e true d�necektir ve while kod blo�una girecektir
		while (i<10) {
			System.out.println("Merhaba UEKAPPS");
			i++;
		}
		
		System.out.println("\n");
		System.out.println("***�rnek 2***");
		
		// 1 den 20 ye kadar olan say�lar�n toplam�n� bulma
		int toplam = 0;
		int k = 0;
		
		while (k < 20) {
			toplam = toplam + k;
			k++;
		}
		
		System.out.println("Toplam= " + toplam);

	}

}
