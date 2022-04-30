package dersler;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Part 1 - �al��ma prensibi
		/*
 		switch(ifade) {
			case de�er1:
				durum
				break;
			case de�er2:
				durum
				break;
			case de�er3:
				durum
				break;
			default:
				durum
				break;
		}
		 */
		
		//Part - 2 
		System.out.println("�rnek 1");
		
		int gun = 6;
		
		switch(gun) {
		case 1:
			System.out.println("Bug�n: Pazartesi");
			break;
		case 2:
			System.out.println("Bug�n: Sal�");
			break;
		case 3:
			System.out.println("Bug�n: �ar�amba");
			break;
		case 4:
			System.out.println("Bug�n: Per�embe");
			break;
		case 5:
			System.out.println("Bug�n: Cuma");
			break;
		case 6:
			System.out.println("Bug�n: Cumartesi");
			break;
		case 7:
			System.out.println("Bug�n: Pazar");
			break;
			default:
				System.out.println("Hata");
				break;
		}
		System.out.println("\n");

		//Part - 2 
		System.out.println("�rnek 2");
		
		// Se�ilen ay de�eri
		int ayDegeri = 4;
		// Yazd�r�lacak ay de�eri
		String ayDegeriStr = null;
		// Switch - case ile hangi ay�n hangi say�ya denk geldi�inin belirtildi�i b�l�m
		switch(ayDegeri) {
		case 1:
			ayDegeriStr = "Ocak";
			break;
		case 2:
			ayDegeriStr = "�ubat";
			break;
		case 3:
			ayDegeriStr = "Mart";
			break;
		case 4:
			ayDegeriStr = "Nisan";
			break;
		case 5:
			ayDegeriStr = "May�s";
			break;
		case 6:
			ayDegeriStr = "Haziran";
			break;
		case 7:
			ayDegeriStr = "Temmuz";
			break;
		case 8:
			ayDegeriStr = "A�ustos";
			break;
		case 9:
			ayDegeriStr = "Eyl�l";
			break;
		case 10:
			ayDegeriStr = "Ekim";
			break;
		case 11:
			ayDegeriStr = "Kas�m";
			break;
		case 12:
			ayDegeriStr = "Aral�k";
			break;
			default:
				break;
		}
		// Konsol ekran�na se�ilen ay�n yazd�r�ld��� b�l�m
		System.out.println("Se�ilen ay de�eri: " + ayDegeriStr);

	}

}
