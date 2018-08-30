package kwartedDanny;

import java.util.ArrayList;
import java.util.Collections;

public class KwartetSpel {

	private int aantalSpelers;

	private ArrayList <Speler> deSpelers = new ArrayList<Speler>();
	private ArrayList <Kaart> deck = new ArrayList<Kaart>();

	public static void main (String [] args) {

		KwartetSpel kwartet = new KwartetSpel();

		kwartet.setUp();

	}


	public void setUp () {
		System.out.println("Met hoeveel spelers speel je?");
		Input input = new Input ();
		String getypt = input.userInput();
		System.out.println("dit heb je getypt: "+ getypt);
		aantalSpelers = Integer.parseInt(getypt); //maakt van de string die je typt een integer

		int setPerSpeler = 1;
		int aantalSets = aantalSpelers*setPerSpeler;
		int setNu = 2;
		String [] vormpjes = {"H","K","S","R"};

		for(int i = setNu; i < aantalSets+setNu; i++) {
			for (String vormpje: vormpjes) {
				Kaart kaart = new Kaart();
				kaart.setKleur(vormpje);
				kaart.setNummerofplaatje(i +"");
				deck.add(kaart);
				//			System.out.println(kaart.getNaam());
			} //end forloop vormpjes

		} //end loop int i

		Collections.shuffle(deck);
		int kaartnummerGepakt = 0;

		for(Kaart kaart: deck) {
			System.out.println(kaart.getNaam());
		}
		//			0	0	<	3       i++
		for(int i = 0; i<aantalSpelers; i++) {
			Speler speler = new Speler();

			for (int y = 0; y < (setPerSpeler*4); y++ , kaartnummerGepakt++) {
				speler.geefKaart(deck.get(kaartnummerGepakt));


			} //end for y loop

			speler.setNaamSpeler(i);
			deSpelers.add(speler);


			System.out.print(speler.getNaamSpeler() + " heeft de kaarten: ");
			for (Kaart kaart : speler.getHand()) {
				System.out.print(kaart.getNaam() + ", ");

			} //for each kaart in hand
			System.out.print("\n");

		} //end for i loop

		spelen();

	} //end setup


	private void spelen () {

		for (Speler gekkie : deSpelers) {
			System.out.println("er is een speler genaamd: " + gekkie);
		}



		boolean isAanHetSpelen = true;
		Speler actieveSpeler = deSpelers.get(0);
		String gekozenSpeler = "";
		while (isAanHetSpelen) {


			System.out.println("" + actieveSpeler.getNaamSpeler() + " mag beginnen!");

			System.out.println("welke speler wil je kiezen?");
			int kiesnummerSpeler = 0;
			for (Speler spelerkies : deSpelers) {
				if (actieveSpeler.equals(spelerkies)) {
					continue;
				} //if actieve speler is de speler kies

				System.out.println("typ: " + spelerkies.getNaamSpeler().replaceFirst("speler ", "") + " voor " + spelerkies.getNaamSpeler());
				
				kiesnummerSpeler++;
				//System.out.println("spelerkies loop wordt gedaan WOW");

			} //end for each speler loop
			System.out.println("typ Q om af te sluiten");

			isAanHetSpelen = false;

		} //end while is aan het spelen == true

	} // end spelen




} //end class
