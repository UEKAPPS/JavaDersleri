package dersler;

public class if_else_kosul_yapisi_and_or {
	
	public static void main(String[] args) {
		
		//Part 1 - Çalýþma prensibi
		/*
		 * int x = 6;
			if(x>5) {
				if(x<10) {
				//iþlemler
				}
			}
		 */
		
		
		/*
		 * Yukarýda gördüðümüz gibi iç içe if kullandýk ve gerekli koþulu saðladýk.
		 * Ama bu kullaným pratik bir kullaným deðildir. Bu gibi birden çok koþul için
		 * AND (ve) - OR (veya) yapýsýný kullanýrýz. Java'da AND için kullanýlan iþaret -> && ,
		 * OR (veya) için kullanýlan iþaret ise -> || , bu ikisidir. Bunlara logical operator adý verilmektedir.
		 */
		
		//Part - 2 Mantýklý Operatörler
		/*
		 *  && (and) (A && B) -> if içindeki tüm koþullar true ise true, deðilse false
		 *  || (or) (A || B) -> if içindeki tek bir koþul true ise true, deðilse false
		 */
		
		//Part - 3 Örnek
		System.out.println("Örnek VE");
		
		int x = 11;
		
		if(x > 5 && x < 10) { // x 5 ten büyük VE 10 dan küçükse (6,7,8,9) bu koþullarý saðlar
			// true iþlemler
			System.out.println("x deðerleri = 6, 7 ,8 ,9'a eþittir." );
		} else {
			// false iþlemler
			System.out.println("x deðerleri = 6, 7 ,8 ,9'a eþit deðildir." );
		}
		
		System.out.println("\n");
		
		System.out.println("Örnek VEYA");
		
		int y = 7;
		int z = 24;
		
		if(y > 5 || z < 10) {
			System.out.println("Ýþlem yapýlýr çünkü y koþulu saðlýyor");
		} else { // diðer durumlar
			
		}
		
		
	}

}
