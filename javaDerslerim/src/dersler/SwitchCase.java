package dersler;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Part 1 - Çalýþma prensibi
		/*
 		switch(ifade) {
			case deðer1:
				durum
				break;
			case deðer2:
				durum
				break;
			case deðer3:
				durum
				break;
			default:
				durum
				break;
		}
		 */
		
		//Part - 2 
		System.out.println("Örnek 1");
		
		int gun = 6;
		
		switch(gun) {
		case 1:
			System.out.println("Bugün: Pazartesi");
			break;
		case 2:
			System.out.println("Bugün: Salý");
			break;
		case 3:
			System.out.println("Bugün: Çarþamba");
			break;
		case 4:
			System.out.println("Bugün: Perþembe");
			break;
		case 5:
			System.out.println("Bugün: Cuma");
			break;
		case 6:
			System.out.println("Bugün: Cumartesi");
			break;
		case 7:
			System.out.println("Bugün: Pazar");
			break;
			default:
				System.out.println("Hata");
				break;
		}
		System.out.println("\n");

		//Part - 2 
		System.out.println("Örnek 2");
		
		// Seçilen ay deðeri
		int ayDegeri = 4;
		// Yazdýrýlacak ay deðeri
		String ayDegeriStr = null;
		// Switch - case ile hangi ayýn hangi sayýya denk geldiðinin belirtildiði bölüm
		switch(ayDegeri) {
		case 1:
			ayDegeriStr = "Ocak";
			break;
		case 2:
			ayDegeriStr = "Þubat";
			break;
		case 3:
			ayDegeriStr = "Mart";
			break;
		case 4:
			ayDegeriStr = "Nisan";
			break;
		case 5:
			ayDegeriStr = "Mayýs";
			break;
		case 6:
			ayDegeriStr = "Haziran";
			break;
		case 7:
			ayDegeriStr = "Temmuz";
			break;
		case 8:
			ayDegeriStr = "Aðustos";
			break;
		case 9:
			ayDegeriStr = "Eylül";
			break;
		case 10:
			ayDegeriStr = "Ekim";
			break;
		case 11:
			ayDegeriStr = "Kasým";
			break;
		case 12:
			ayDegeriStr = "Aralýk";
			break;
			default:
				break;
		}
		// Konsol ekranýna seçilen ayýn yazdýrýldýðý bölüm
		System.out.println("Seçilen ay deðeri: " + ayDegeriStr);

	}

}
