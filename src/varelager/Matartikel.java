package varelager;


import java.util.ArrayList;
import java.util.GregorianCalendar;

import medlemmer.Leverandor;


public class Matartikel extends Artikel{
	
	private static ArrayList<Matartikel> matartikelliste = new ArrayList<Matartikel>();
	
	public static ArrayList<Matartikel> getMatartikelliste() {
		return matartikelliste;
	}
	
	public Matartikel(String navn, double innPris, double utPris,
			Leverandor leverandor, GregorianCalendar bestfor) {
		super(navn, innPris, utPris, leverandor);
		this.bestfor = bestfor;
		antMatArt = antMatArt+1;
		matartikelliste.add(this);
	}
	private static int antMatArt = 0;
	
	
	private GregorianCalendar bestfor;
	
	
	
	public GregorianCalendar getBestfor() {
		return bestfor;
	}
	public void setBestfor(GregorianCalendar bestfor) {
		this.bestfor = bestfor;
	}
	public static int getAntMatArt() {
		return antMatArt;
	}
	
	public String toString(){
		return this.getNavn();
	}
	
	@Override
	public void selg(){
		super.selg();
		antMatArt = antMatArt-1;
		matartikelliste.remove(this);
	}

	
	
	
}
