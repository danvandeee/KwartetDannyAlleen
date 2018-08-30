package kwartedDanny;

import java.util.ArrayList;

public class Speler {
	private ArrayList <Kaart> hand = new ArrayList<Kaart>();
	private String naamSpeler;
	
	public void geefKaart (Kaart kaart) {
		
		hand.add(kaart);
		
	}
	
	public void setNaamSpeler (int spelernu) {
		
		naamSpeler = ("speler " + spelernu);
		
	}
	
public String getNaamSpeler () {
		
		return naamSpeler;
		
	}
	
	
	public ArrayList <Kaart> getHand () {
		return hand;
		
	}
	
	public Kaart checkKaartUitHand (Kaart kaart) {
		
		for (Kaart kaartje : hand) {
			if (kaartje == kaart) {
				hand.remove(kaartje);
				return kaartje;
			} //end if kaartje
			
			
		} //end for loop
		return null;
		
		
	} //end removekaartuithand
	
	
}
