package dersler;

public class degiskenler_veri_tipleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tam Sayýlar
		System.out.println("*****Tam sayýlar****");

		//byte 8 bit -128 ile 127
		//short 16 bit -32768 ile 32767
		//integer 32 bit -2.147.483.648 ile 2.147.483.647
		//long 64 bit -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807
		
	
		byte byteDeger = 4;
		System.out.println("byteDeger: " + byteDeger);
		
		short shortDeger = 7;
		System.out.println("shortDeger: " + shortDeger);
		
		int intDeger = 241;
		System.out.println("intDeger: " + intDeger);
		
		long longDeger = 1881;
		System.out.println("longDeger: " + longDeger);
		System.out.println("\n");

		//Reel Sayýlar
		System.out.println("*****Reel Sayýlar****");
		//float  32 bit 1.4×10^-45 ile 3.4×10^38
		//double 64 bit 4.9*10^-324 ile 1.8*10^308
		
		float floatDeger = 10.4f;
		System.out.println("floatDeger: " + floatDeger);
		
		double doubleDeger = 241.4;
		System.out.println("doubleDeger: " + doubleDeger);
		System.out.println("\n");
		
		//Karakterler
		System.out.println("*****Karakterler****");
		//char 16 bit Unicode 0 ile Unicode 2^16-1
		char charDeger1 = 65;
		System.out.println("charDeger1: " + charDeger1);
		
		char charDeger2 = 'A';
		System.out.println("charDeger2: " + charDeger2);
		System.out.println("\n");
		
		//Mantýksal Deðerler
		System.out.println("*****Mantýksal Deðerler****");
		boolean dogruDeger = true;
		System.out.println("dogruDeger: " + dogruDeger);
		
		boolean yanlisDeger = false;
		System.out.println("yanlisDeger: " + yanlisDeger);


	}

}
