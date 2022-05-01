package dersler;

import java.util.Scanner;

public class While_SayiTahminEtme {

	public static void main(String[] args) {
		
		// Math.random() ile ürettiðimiz random bir swayýyý tahmin etme
		int sayi = (int)(Math.random() * 101);
		// 0 ile 100 arasýnda bir sayý üretir 100'de olabilir
		
		Scanner input = new Scanner(System.in);
		// Kullanýcýdan sayý alabilmek için Scanner sýnýfýný kullandýk
		
		int tahmin = -1;
		// 0 ile 100 arasýnda olmasý için -1 verdik
		
		while (sayi != tahmin) {
			// Sayý tahmine eþit olmadýðý sürece true dönecek ve bu iþlem tekrarlanacak
			// Sayý iþleme eþit olduðunda false dönecek ve döngüye girmeyecek
			
			System.out.print("Tahmin ettiðiniz sayýyý giriniz: ");
			
			tahmin = input.nextInt();
			// Sayý kullanýcýdan alýnýr
			
			if (tahmin == sayi) {
				System.out.println("Doðru tahmin Çatal-Býçak seti kazandýnýz!");
				
			} else if (tahmin > sayi){
				System.out.println("Tahmininizi Azaltýn");
				
			} else {
				System.out.println("Tahmininizi Arttýrýn");
			}
		}
		/*
		 * Yukarýdaki kodu açýklamak gerekirse kod çalýþýr çalýþmaz 0 ile 100
		 * arasýnda bir sayýyý random olarak oluþturuyor. Sonrasýnda while
		 * döngüsü içinde kullanýcýdan klavyeden tahmin girmesini istiyor. Eðer
		 * bu tahmin random oluþturulan sayýya eþitse "Doðru tahmin", büyükse
		 * "Tahmininizi Azaltýn", küçükse "Tahmininizi Arttýrýn" mesajý veriyor.
		 * Girilen tahmin zaten sayýya eþitse "Doðru tahmin" mesajý verildikten
		 * sonra sayi != tahmin koþulunu saðlamayacaðý için tekrardan döngüye
		 * girmeyecek ve bu kodumuzda baþka iþlem olmadýðý için programýmýzý sonlandýracaktýr.
		 */
		
	}

}
