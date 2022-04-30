package dersler;

public class string_veri_tipi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("**Part 1**");
		
		
		char[] karakterler = {'M','e','r','h','a','b','a'};
		String stringDeger1 = new String(karakterler);
		System.out.println(stringDeger1);
		
		
		/*
		 * Örnekten de görebileceðiniz gibi kodu koþturduðumuzda 
		 * konsol ekranýna “Merhaba” yazdýðýný göreceksiniz. 
		 * Elbette kod yazarken Java String veri tipi bu þekilde 
		 * karakterleri tek tek yazarak elde edilmiyor. 
		 * Bunu yerine aþaðýdaki þekilde bir Java String veri tipi 
		 * tanýmlamasý yapabiliriz.
		 */
		 
		System.out.println("\n");
		
		System.out.println("**Part 2**");
		
		 //Farklý bir String veri tipi tanýmlama yöntemi
		String stringDeger2 = "Merhaba Ufuk Enes Kurt Öðrencileri";
	
		// M = 0 , e = 1,  ..... r = 32, i = 33
		// Yukarýda ki stringDegeri seçtiðimiz index
		// deðerlerini daha rahat bir þekilde takip edebilirsiniz.
		// Bu þekilde String verileri bölüp istediðiniz kýsmý 
		// yazdýrabileceðiniz gibi yine String veri tipinin 
		// özelliklerinden faydalanarak tüm harfleri büyük ve ya 
		// tüm harflari küçük þekilde yazdýrabilirsiniz.
		
		
		//String deðerden bir karakter çekme
		char charDeger = stringDeger2.charAt(11);
		System.out.println(charDeger);
		
		//Substring Kullanýmý
		String substringDeger1 = stringDeger2.substring(8);
		System.out.println(substringDeger1);
		
		//Substring Kullanýmý
		String substringDeger2 = stringDeger2.substring(0, 12);
		System.out.println(substringDeger2);
		
		System.out.println("\n");
		
		System.out.println("**Part 3**");
		
		
		 String stringDeger3 = "Merhaba UFUK Enes Kurt Öðrencileri";
		 
		 // String tipinin bir baþka özelliði de deðer olarak atanmýþ 
		 // metin içerisinde istediðimiz bir karakteri yine istediðimiz 
		 // bir karakterle deðiþtirebiliyor olmamýzdýr.
		 
		 // Ayrýca yine String veri tipini kullanarak iki metin birbiriyle 
		 // ayný mý metin içerisinde bir kelime geçiyor mu gibi 
		 // kontrollerde gerçekleþtirebiliriz.
		 
		//Büyük Harf yapma
		System.out.println(stringDeger3.toUpperCase());
		//Küçük Harf yapma
		System.out.println(stringDeger3.toLowerCase());
		//Harf Deðiþtirme
		System.out.println(stringDeger3.replace("a","e"));
		//Kelime Deðiþtirme
		System.out.println(stringDeger3.replace("Merhaba","Selam"));
		 
				
		System.out.println("\n");
		
		System.out.println("**Part 4**");
		
		
		 String stringDeger4 = "Merhaba UFUK Enes Kurt Öðrencileri";
		
		//Doðru Durum
		boolean durum1 = stringDeger4.equals("Merhaba UFUK Enes Kurt Öðrencileri");
		System.out.println("durum1: "+durum1);
		
		//Yanlýþ Durum
		boolean durum2 = stringDeger4.equals("Merhaba Ufuk Enes Kurt Öðrencileri");
		System.out.println("durum2: "+ durum2);
		
		//Yazýnýn büyük ya da küçük harf olmasý önemsiz
		boolean durum3 = stringDeger4.equalsIgnoreCase("merhaba ufuk enes KURT öðrencileri");
		System.out.println("durum3: " + durum3);
		 
		
		System.out.println("\n");
		
		System.out.println("**Part 5**");
		
		
		String a = "Merhaba ";
		String b = "Ufuk Enes KURT Öðrencileri";
		
		System.out.println(a+b);
		//VEYA
		
		String c = a+ b;
		
		System.out.println(c);
		
		//VEYA
		
		System.out.println("Merhaba " + "Ufuk Enes Kurt Öðrencileri");
		 
		int bb = 1;
		int aa = 3;
		
		System.out.println(aa + bb);
		
		
		
	
	}

}
