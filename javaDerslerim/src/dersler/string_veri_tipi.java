package dersler;

public class string_veri_tipi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("**Part 1**");
		
		
		char[] karakterler = {'M','e','r','h','a','b','a'};
		String stringDeger1 = new String(karakterler);
		System.out.println(stringDeger1);
		
		
		/*
		 * �rnekten de g�rebilece�iniz gibi kodu ko�turdu�umuzda 
		 * konsol ekran�na �Merhaba� yazd���n� g�receksiniz. 
		 * Elbette kod yazarken Java String veri tipi bu �ekilde 
		 * karakterleri tek tek yazarak elde edilmiyor. 
		 * Bunu yerine a�a��daki �ekilde bir Java String veri tipi 
		 * tan�mlamas� yapabiliriz.
		 */
		 
		System.out.println("\n");
		
		System.out.println("**Part 2**");
		
		 //Farkl� bir String veri tipi tan�mlama y�ntemi
		String stringDeger2 = "Merhaba Ufuk Enes Kurt ��rencileri";
	
		// M = 0 , e = 1,  ..... r = 32, i = 33
		// Yukar�da ki stringDegeri se�ti�imiz index
		// de�erlerini daha rahat bir �ekilde takip edebilirsiniz.
		// Bu �ekilde String verileri b�l�p istedi�iniz k�sm� 
		// yazd�rabilece�iniz gibi yine String veri tipinin 
		// �zelliklerinden faydalanarak t�m harfleri b�y�k ve ya 
		// t�m harflari k���k �ekilde yazd�rabilirsiniz.
		
		
		//String de�erden bir karakter �ekme
		char charDeger = stringDeger2.charAt(11);
		System.out.println(charDeger);
		
		//Substring Kullan�m�
		String substringDeger1 = stringDeger2.substring(8);
		System.out.println(substringDeger1);
		
		//Substring Kullan�m�
		String substringDeger2 = stringDeger2.substring(0, 12);
		System.out.println(substringDeger2);
		
		System.out.println("\n");
		
		System.out.println("**Part 3**");
		
		
		 String stringDeger3 = "Merhaba UFUK Enes Kurt ��rencileri";
		 
		 // String tipinin bir ba�ka �zelli�i de de�er olarak atanm�� 
		 // metin i�erisinde istedi�imiz bir karakteri yine istedi�imiz 
		 // bir karakterle de�i�tirebiliyor olmam�zd�r.
		 
		 // Ayr�ca yine String veri tipini kullanarak iki metin birbiriyle 
		 // ayn� m� metin i�erisinde bir kelime ge�iyor mu gibi 
		 // kontrollerde ger�ekle�tirebiliriz.
		 
		//B�y�k Harf yapma
		System.out.println(stringDeger3.toUpperCase());
		//K���k Harf yapma
		System.out.println(stringDeger3.toLowerCase());
		//Harf De�i�tirme
		System.out.println(stringDeger3.replace("a","e"));
		//Kelime De�i�tirme
		System.out.println(stringDeger3.replace("Merhaba","Selam"));
		 
				
		System.out.println("\n");
		
		System.out.println("**Part 4**");
		
		
		 String stringDeger4 = "Merhaba UFUK Enes Kurt ��rencileri";
		
		//Do�ru Durum
		boolean durum1 = stringDeger4.equals("Merhaba UFUK Enes Kurt ��rencileri");
		System.out.println("durum1: "+durum1);
		
		//Yanl�� Durum
		boolean durum2 = stringDeger4.equals("Merhaba Ufuk Enes Kurt ��rencileri");
		System.out.println("durum2: "+ durum2);
		
		//Yaz�n�n b�y�k ya da k���k harf olmas� �nemsiz
		boolean durum3 = stringDeger4.equalsIgnoreCase("merhaba ufuk enes KURT ��rencileri");
		System.out.println("durum3: " + durum3);
		 
		
		System.out.println("\n");
		
		System.out.println("**Part 5**");
		
		
		String a = "Merhaba ";
		String b = "Ufuk Enes KURT ��rencileri";
		
		System.out.println(a+b);
		//VEYA
		
		String c = a+ b;
		
		System.out.println(c);
		
		//VEYA
		
		System.out.println("Merhaba " + "Ufuk Enes Kurt ��rencileri");
		 
		int bb = 1;
		int aa = 3;
		
		System.out.println(aa + bb);
		
		
		
	
	}

}
