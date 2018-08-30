package kwartedDanny;

public class Kaart {

	String kleur;
	String nummerofplaatje;
	
	public String getNaam () {
		return (kleur + nummerofplaatje);
	}
	
	public String getKleur () {
		
		return kleur;
	}
	public void setKleur(String kleur) {
		this.kleur = kleur;
	}
	
	
	public String getNummerofplaatje () {
		return nummerofplaatje;
		
	}
	
	public void setNummerofplaatje(String nummerofplaatje) {
		this.nummerofplaatje = nummerofplaatje;
	}
}
