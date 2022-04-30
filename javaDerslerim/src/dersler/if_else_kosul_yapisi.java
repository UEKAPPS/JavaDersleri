package dersler;

public class if_else_kosul_yapisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Part 1 - Çalýþma prensibi
		/*
		 * if(boolean) // true ve ya yanlýþ  {
			//true ise yapýlacak iþlemler 
				} else if(boolean) {
				//false ise yapýlacak iþlemler
				} else {
			
			}
		 */
		
		
		//Part - 2 Operatörler
		/*
		 *  == (eþit) (A == B) -> iki deðer eþitse true, deðilse false
		 *  != (eþit deðildir) (A !=B ) -> iki deðer eþit deðilse true, eþitse false
		 *  > (büyüktür) (A > B) -> birinci deðer ikinciden büyükse true, deðilse false
		 *  < (küçüktür) (A < B) -> birinci deðer ikinciden küçükse true, deðilse false
		 *  >= (büyük eþitse) (A >= B) -> birinci deðer ikinciden büyükse ya da ikinciye eþitse true, deðilse false
		 *  <= (küçük eþitse) (A <= B) -> birinci deðer ikinciden küçükse ya da ikinciye eþitse true, deðilse false
		 */
		
		//Part - 3 Örnek
		System.out.println("Örnek 1");
		
		int x = 3;
		
		if(x>0) { // x>0 koþulu true döneceði için 
			int z = x*9;
			System.out.println("z deðeri = " + z);
		}
		 		
		System.out.println("\n");
		
		System.out.println("Örnek 2");
				
		int y = 0;
		
		if(y>0) { // y>0 koþulu false döneceði için
			int f = y*5;
			
			System.out.println("f deðeri = " + f);
		} //Herhangi bir konsol çýktýsý olmayacaktýr.
		 
		
		System.out.println("\n");
		
		//Part 4 if-else if - else
		System.out.println("Örnek 3");
		/*
		 * Peki diyelim ki if koþulu saðlanmazsa da baþka bir kod bloðu çalýþtýrmak
		 * istiyorsak, yani üstteki örnekten yola çýkarak x'imiz 0'dan büyük deðilse
		 * baþka bir iþlem yaptýrmak istiyorsak, bu durumda else bloðu çalýþsacaktýr.
		 * Zaten yapý genel olarak if-else olarak kullanýlýr. Yani koþul saðlanýrsa
		 * if bloðu içindeki kodlar çalýþýr, saðlanmazsa else bloðu içindeki çalýþýr.
		 */
		
		int sayi = 70;
		
		if(sayi>90) {
			System.out.println("sayi 90'dan büyüktür");
		} else if(sayi>=80) {
			System.out.println("sayi 90 ile 80 arasýndadýr");
		} else if(sayi>=70) {
			System.out.println("sayi 80 ile 70 arasýndadýr");
		} else if(sayi>60) {
			System.out.println("sayi 60'dan büyüktür");
		} else if(sayi>50) {
			System.out.println("sayi 50'dan büyüktür");
		} else if(sayi>40) {
			System.out.println("sayi 40'dan büyüktür");
		} else if(sayi>30) {
			System.out.println("sayi 30'dan büyüktür");
		} else if(sayi>20) {
			System.out.println("sayi 20'dan büyüktür");
		} else if(sayi>10) {
			System.out.println("sayi 10'dan büyüktür");
		} else if(sayi>0) {
			System.out.println("sayi 0'dan büyüktür");
		} else {
			System.out.println("sayi negatif");
		}
		
		
	} 
}

















