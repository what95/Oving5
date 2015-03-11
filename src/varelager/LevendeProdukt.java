package varelager;
import java.util.ArrayList;

import medlemmer.Leverandor;


public abstract class LevendeProdukt extends Produkt{
	private String slektsnavn;
	private String artsnavn;
	private static int antLevProd = 0;
	private static ArrayList<LevendeProdukt> LevendeProduktliste = new ArrayList<LevendeProdukt>();
	
	public static ArrayList<LevendeProdukt> getLevendeProduktliste() {
		return LevendeProduktliste;
	}
	
	public LevendeProdukt(String navn, double innPris, double utPris,
			Leverandor leverandor, String slektsnavn, String artsnavn) {
		super(navn, innPris, utPris, leverandor);
		this.slektsnavn = slektsnavn;
		this.artsnavn = artsnavn;
		antLevProd = antLevProd+1;
		LevendeProduktliste.add(this);
	}
	
	@Override
	public String toString(){
		return this.getObnvn() + " - " +artsnavn + " - " + this.getNavn();
	}
	
	public String getObnvn() {
		// TODO Auto-generated method stub
		return null;
	}

	public static int getAntLevProd() {
		return antLevProd;
	}
	public String getSlektsnavn() {
		return slektsnavn;
	}
	public void setSlektsnavn(String slektsnavn) {
		this.slektsnavn = slektsnavn;
	}
	public String getArtsnavn() {
		return artsnavn;
	}
	public void setArtsnavn(String artsnavn) {
		this.artsnavn = artsnavn;
	}
	@Override
	public void selg(){
		super.selg();
		antLevProd = antLevProd-1;
		
		LevendeProduktliste.remove(this);
	}

	
	
}
