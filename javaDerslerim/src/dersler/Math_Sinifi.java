package dersler;

public class Math_Sinifi {

	public static void main(String[] args) {
		
		// Tek parametre al�r(double) ve bir b�y�k tam say�ya yuvarlama yapar.
		System.out.println("Math.ceil(2.6)= " + Math.ceil(2.6));
		// pi say�s� de�erini verir
		System.out.println("Math.PI= " + Math.PI);
		// Tek parametre al�r(double) ve cos de�eri d�ner Math.cos(30)
		System.out.println("Math.cos(Math.PI)= " + Math.cos(Math.PI));
		// Tek parametre al�r(double) ve sin de�eri d�ner Math.sin(30)
		System.out.println("Math.sin(Math.PI / 2)= " + Math.sin(Math.PI / 2));
		// Tek parametre al�r(double) ve bir k���k tam say�ya yuvarlar
		System.out.println("Math.floor(2.6)= " + Math.floor(2.6));
		// �ki parametre al�r ve parametrelerden b�y�k olan say�y� geri d�ner
		System.out.println("Math.max(2.5,9)= " + Math.max(2.5,9));
		// �ki parametre al�r ve parametrelerden k���k olan say�y� geri d�ner
		System.out.println("Math.min(2.5,9)= " + Math.min(2.5,9));
		// 3 �ss� 5 anlam�na gelir �sl� ifade yazmak i�in kullan�l�r 3^5
		System.out.println("Math.pow(3,5)= " + Math.pow(3,5));
		// Parametre almaz ve 0 ile 1 aras�nda double bir de�er d�ner
		System.out.println("Math.random()= " + Math.random());
		// Tek parametre al�r(float) ve yak�n olan tam say�ya d�ner 
		System.out.println("Math.round(2.4)= " + Math.round(2.4));
		System.out.println("Math.round(2.5)= " + Math.round(2.5));
		System.out.println("Math.round(2.6)= " + Math.round(2.6));
	}

}
