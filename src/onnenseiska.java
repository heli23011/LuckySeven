import java.util.Scanner;
import java.util.Random;

public class onnenseiska {

	public static void main(String[] args) {
		
		//toinen GitHub-muutos
		Scanner in = new Scanner(System.in);
		Random arvottunro = new Random();
		int rahamaara = 0;
		String kayttajanvastaus = "k";
		String kayttajanraha;
		int random1 = arvottunro.nextInt(10) + 1;
		int random2 = arvottunro.nextInt(10) + 1;
		int random3 = arvottunro.nextInt(10) + 1;
		
		System.out.println("Anna rahamäärä, jolla haluat pelata.");
		kayttajanraha = in.nextLine();
		rahamaara = Integer.parseInt(kayttajanraha);
				
		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);
		
		while (kayttajanvastaus.equals("k")) {
			rahamaara = (rahamaara - 1);
			if(random1 == 7 && random2 == 7 && random3 == 7) {
				System.out.println("Rahaa jäljellä: " + rahamaara + "e. Voitit 10e. Pelaatko vielä? k/e");
				rahamaara = rahamaara + 10;
				kayttajanvastaus = in.nextLine();
				if(kayttajanvastaus.equals("e")) {
					System.out.println("Kiitos, kun pelasit.");
					break;
				} else if(rahamaara <= 0) {
					System.out.println("Rahaa jäljellä: " + rahamaara + "e. Rahat loppu. Kiitos kun pelasit.");
					break;
				} else {
					random1 = arvottunro.nextInt(10) + 1;
					random2 = arvottunro.nextInt(10) + 1;
					random3 = arvottunro.nextInt(10) + 1;
					System.out.println(random1);
					System.out.println(random2);
					System.out.println(random3);
				}
			} else if((random1 == 7 && random2 == 7) || (random1 == 7 && random3 == 7) || (random2 == 7 && random3 == 7)) {
				System.out.println("Rahaa jäljellä: " + rahamaara + "e. Voitit 5e. Pelaatko vielä? k/e");
				rahamaara = rahamaara + 5;
				kayttajanvastaus = in.nextLine();
				if(kayttajanvastaus.equals("e")) {
					System.out.println("Kiitos, kun pelasit.");
					break;
				} else if(rahamaara <= 0) {
					System.out.println("Rahaa jäljellä: " + rahamaara + "e. Rahat loppu. Kiitos kun pelasit.");
					break;
				} else {
					random1 = arvottunro.nextInt(10) + 1;
					random2 = arvottunro.nextInt(10) + 1;
					random3 = arvottunro.nextInt(10) + 1;
					System.out.println(random1);
					System.out.println(random2);
					System.out.println(random3);
				}
			} else if(random1 == 7 || random2 == 7 || random3 == 7) {
				System.out.println("Rahaa jäljellä: " + rahamaara + "e. Voitit 3e. Pelaatko vielä? k/e");
				rahamaara = rahamaara +3;
				kayttajanvastaus = in.nextLine();
				if(kayttajanvastaus.equals("e")) {
					System.out.println("Kiitos, kun pelasit.");
					break;
				} else if(rahamaara <= 0) {
					System.out.println("Rahaa jäljellä: " + rahamaara + "e. Rahat loppu. Kiitos kun pelasit.");
					break;
				} else {
					random1 = arvottunro.nextInt(10) + 1;
					random2 = arvottunro.nextInt(10) + 1;
					random3 = arvottunro.nextInt(10) + 1;
					System.out.println(random1);
					System.out.println(random2);
					System.out.println(random3);
				}
			} else {
				System.out.println("Rahaa jäljellä: " + rahamaara + "e. Hävisit. Pelataanko vielä? k/e");
				kayttajanvastaus = in.nextLine();
				if(kayttajanvastaus.equals("e")) {
					System.out.println("Kiitos, kun pelasit.");
					break;
				} else if(rahamaara <= 0) {
					System.out.println("Rahaa jäljellä: " + rahamaara + "e. Rahat loppu. Kiitos kun pelasit.");
					break;
				} else {
					random1 = arvottunro.nextInt(10) + 1;
					random2 = arvottunro.nextInt(10) + 1;
					random3 = arvottunro.nextInt(10) + 1;
					System.out.println(random1);
					System.out.println(random2);
					System.out.println(random3);
				}
			}
		}

		in.close();
	}

}
