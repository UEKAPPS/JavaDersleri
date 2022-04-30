package dersler;

public class if_else_kosul_yapisi_and_or {
	
	public static void main(String[] args) {
		
		//Part 1 - �al��ma prensibi
		/*
		 * int x = 6;
			if(x>5) {
				if(x<10) {
				//i�lemler
				}
			}
		 */
		
		
		/*
		 * Yukar�da g�rd���m�z gibi i� i�e if kulland�k ve gerekli ko�ulu sa�lad�k.
		 * Ama bu kullan�m pratik bir kullan�m de�ildir. Bu gibi birden �ok ko�ul i�in
		 * AND (ve) - OR (veya) yap�s�n� kullan�r�z. Java'da AND i�in kullan�lan i�aret -> && ,
		 * OR (veya) i�in kullan�lan i�aret ise -> || , bu ikisidir. Bunlara logical operator ad� verilmektedir.
		 */
		
		//Part - 2 Mant�kl� Operat�rler
		/*
		 *  && (and) (A && B) -> if i�indeki t�m ko�ullar true ise true, de�ilse false
		 *  || (or) (A || B) -> if i�indeki tek bir ko�ul true ise true, de�ilse false
		 */
		
		//Part - 3 �rnek
		System.out.println("�rnek VE");
		
		int x = 11;
		
		if(x > 5 && x < 10) { // x 5 ten b�y�k VE 10 dan k���kse (6,7,8,9) bu ko�ullar� sa�lar
			// true i�lemler
			System.out.println("x de�erleri = 6, 7 ,8 ,9'a e�ittir." );
		} else {
			// false i�lemler
			System.out.println("x de�erleri = 6, 7 ,8 ,9'a e�it de�ildir." );
		}
		
		System.out.println("\n");
		
		System.out.println("�rnek VEYA");
		
		int y = 7;
		int z = 24;
		
		if(y > 5 || z < 10) {
			System.out.println("��lem yap�l�r ��nk� y ko�ulu sa�l�yor");
		} else { // di�er durumlar
			
		}
		
		
	}

}
