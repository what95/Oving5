package varelager;
import medlemmer.Leverandor;


public class Artikel extends Produkt{
	public Artikel(String navn, double innPris, double utPris,
			Leverandor leverandor) {
		super(navn, innPris, utPris, leverandor);
		// TODO Auto-generated constructor stub
		antArt = antArt+1;
	}

	private static int antArt = 0;

	public static int getAntArt() {
		return antArt;
	}
	
	@Override
	public void selg(){
		super.selg();
		antArt = antArt-1;
	}
}
