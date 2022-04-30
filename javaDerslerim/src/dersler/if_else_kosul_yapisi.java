package dersler;

public class if_else_kosul_yapisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Part 1 - �al��ma prensibi
		/*
		 * if(boolean) // true ve ya yanl��  {
			//true ise yap�lacak i�lemler 
				} else if(boolean) {
				//false ise yap�lacak i�lemler
				} else {
			
			}
		 */
		
		
		//Part - 2 Operat�rler
		/*
		 *  == (e�it) (A == B) -> iki de�er e�itse true, de�ilse false
		 *  != (e�it de�ildir) (A !=B ) -> iki de�er e�it de�ilse true, e�itse false
		 *  > (b�y�kt�r) (A > B) -> birinci de�er ikinciden b�y�kse true, de�ilse false
		 *  < (k���kt�r) (A < B) -> birinci de�er ikinciden k���kse true, de�ilse false
		 *  >= (b�y�k e�itse) (A >= B) -> birinci de�er ikinciden b�y�kse ya da ikinciye e�itse true, de�ilse false
		 *  <= (k���k e�itse) (A <= B) -> birinci de�er ikinciden k���kse ya da ikinciye e�itse true, de�ilse false
		 */
		
		//Part - 3 �rnek
		System.out.println("�rnek 1");
		
		int x = 3;
		
		if(x>0) { // x>0 ko�ulu true d�nece�i i�in 
			int z = x*9;
			System.out.println("z de�eri = " + z);
		}
		 		
		System.out.println("\n");
		
		System.out.println("�rnek 2");
				
		int y = 0;
		
		if(y>0) { // y>0 ko�ulu false d�nece�i i�in
			int f = y*5;
			
			System.out.println("f de�eri = " + f);
		} //Herhangi bir konsol ��kt�s� olmayacakt�r.
		 
		
		System.out.println("\n");
		
		//Part 4 if-else if - else
		System.out.println("�rnek 3");
		/*
		 * Peki diyelim ki if ko�ulu sa�lanmazsa da ba�ka bir kod blo�u �al��t�rmak
		 * istiyorsak, yani �stteki �rnekten yola ��karak x'imiz 0'dan b�y�k de�ilse
		 * ba�ka bir i�lem yapt�rmak istiyorsak, bu durumda else blo�u �al��sacakt�r.
		 * Zaten yap� genel olarak if-else olarak kullan�l�r. Yani ko�ul sa�lan�rsa
		 * if blo�u i�indeki kodlar �al���r, sa�lanmazsa else blo�u i�indeki �al���r.
		 */
		
		int sayi = 70;
		
		if(sayi>90) {
			System.out.println("sayi 90'dan b�y�kt�r");
		} else if(sayi>=80) {
			System.out.println("sayi 90 ile 80 aras�ndad�r");
		} else if(sayi>=70) {
			System.out.println("sayi 80 ile 70 aras�ndad�r");
		} else if(sayi>60) {
			System.out.println("sayi 60'dan b�y�kt�r");
		} else if(sayi>50) {
			System.out.println("sayi 50'dan b�y�kt�r");
		} else if(sayi>40) {
			System.out.println("sayi 40'dan b�y�kt�r");
		} else if(sayi>30) {
			System.out.println("sayi 30'dan b�y�kt�r");
		} else if(sayi>20) {
			System.out.println("sayi 20'dan b�y�kt�r");
		} else if(sayi>10) {
			System.out.println("sayi 10'dan b�y�kt�r");
		} else if(sayi>0) {
			System.out.println("sayi 0'dan b�y�kt�r");
		} else {
			System.out.println("sayi negatif");
		}
		
		
	} 
}

















