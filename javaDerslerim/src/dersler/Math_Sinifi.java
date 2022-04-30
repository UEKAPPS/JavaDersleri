package dersler;

public class Math_Sinifi {

	public static void main(String[] args) {
		
		// Tek parametre alýr(double) ve bir büyük tam sayýya yuvarlama yapar.
		System.out.println("Math.ceil(2.6)= " + Math.ceil(2.6));
		// pi sayýsý deðerini verir
		System.out.println("Math.PI= " + Math.PI);
		// Tek parametre alýr(double) ve cos deðeri döner Math.cos(30)
		System.out.println("Math.cos(Math.PI)= " + Math.cos(Math.PI));
		// Tek parametre alýr(double) ve sin deðeri döner Math.sin(30)
		System.out.println("Math.sin(Math.PI / 2)= " + Math.sin(Math.PI / 2));
		// Tek parametre alýr(double) ve bir küçük tam sayýya yuvarlar
		System.out.println("Math.floor(2.6)= " + Math.floor(2.6));
		// Ýki parametre alýr ve parametrelerden büyük olan sayýyý geri döner
		System.out.println("Math.max(2.5,9)= " + Math.max(2.5,9));
		// Ýki parametre alýr ve parametrelerden küçük olan sayýyý geri döner
		System.out.println("Math.min(2.5,9)= " + Math.min(2.5,9));
		// 3 üssü 5 anlamýna gelir üslü ifade yazmak için kullanýlýr 3^5
		System.out.println("Math.pow(3,5)= " + Math.pow(3,5));
		// Parametre almaz ve 0 ile 1 arasýnda double bir deðer döner
		System.out.println("Math.random()= " + Math.random());
		// Tek parametre alýr(float) ve yakýn olan tam sayýya döner 
		System.out.println("Math.round(2.4)= " + Math.round(2.4));
		System.out.println("Math.round(2.5)= " + Math.round(2.5));
		System.out.println("Math.round(2.6)= " + Math.round(2.6));
	}

}
