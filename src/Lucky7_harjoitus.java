import java.util.Random;
import java.util.Scanner;

public class Lucky7_harjoitus {

	public static void main(String[] args) {
		
		Random random = new Random(); // Numeroiden arpoja
		Scanner in = new Scanner(System.in); //Tekstin syöttö

		
		System.out.println("Tervetuloa pelaamaan Lucky7! Peli arpoo 3 numeroa väliltä 1-10.");
		System.out.println("Yhdestä 7 voitat 2€, kahdesta 4 € ja kolmesta 7€.");
		System.out.println("Syötä ensin rahasumma.");
		int raha = in.nextInt();
		in.nextLine(); // jotta uuden rivin merkit eivät sekoitu rahasumman syötön kanssa
		
		
		String peli = "";
		
		System.out.println("Aloitetaanko peli? y tai n");
		
		while (true) {
			peli = in.nextLine();
			
			int randomNumber1= random.nextInt(10)+1,
				randomNumber2= random.nextInt(10)+1,
				randomNumber3= random.nextInt(10)+1;
			if (raha==0) {
			System.out.println("Visukinttu! Et voi pelata ilman mielikuvitus rahaa!");
			break;
			}
		
			else {
		
				if (peli.equals("y")) { 
					raha--;
					System.out.print("    " + randomNumber1);
					System.out.print("    " + randomNumber2);
					System.out.println("    " + randomNumber3);
				 
					if  (randomNumber1 == 7) {
						 
						if (randomNumber2 == 7) {
							
							if (randomNumber3 == 7) { //JACKPOTTI
								System.out.println("JACKPOT! Voitit 7€!");
								raha = raha +7;}
							
							else {
								System.out.println("Hienoa! Voitit 4€");
								raha = raha +4;}
						}
						
						else if (randomNumber3 == 7) {
							System.out.println("Hienoa! Voitit 4€");
							raha = raha +4;}
						
						else {
							 System.out.println("Onnea! Voitit 2€");
						 	raha = raha +2; }
					}
				 
					else if  (randomNumber2 == 7) {
						 
						if (randomNumber1 == 7) {
							System.out.println("Hienoa! Voitit 4€");
							raha = raha +4;}
					 
						else if (randomNumber3 == 7) {
							System.out.println("Hienoa! Voitit 4€");
							raha = raha +4;}
					 
						else {
							 System.out.println("Onnea! Voitit 2€");
						 	raha = raha +2;}
					}
				 
					else if (randomNumber3 == 7) {
						System.out.println("Hienoa! Voitit 2€");
						raha = raha +2;}
					 
					else {
						System.out.println("Ei voittoa tällä kertaa.");}	
				 
				 
				 
				System.out.println("Sinulla on rahaa " + raha + "€");  //RAHA MÄÄRÄN SEURAUS!!!!
				
				
				
				if (raha==0) {
					System.out.println("Rahasi loppui. Peli päättyi!");
					break;}
				
				else {
				System.out.println("Haluatko pelata uudestaan? Syötä y tai n.");
					}
				}
			
			
			else if (peli.equals("n")) {
				System.out.println("Peli päättyi!");
				break;}
			
			else {
				System.out.println("Koitappa kirjottaa uudestaan");}
			}
		}
	}

}

