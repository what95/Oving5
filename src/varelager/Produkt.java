package varelager;
import medlemmer.Leverandor;


public abstract class Produkt {
	
	private String navn;
	private double innPris;
	private double utPris;
	private Leverandor Leverandor;
	private static int antProd = 0;
	
	
	
	public Produkt(String navn, double innPris, double utPris,
			Leverandor leverandor) {
		this.navn = navn;
		this.innPris = innPris;
		this.utPris = utPris;
		Leverandor = leverandor;
		antProd = antProd + 1;
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public double getInnPris() {
		return innPris;
	}

	public void setInnPris(double innPris) {
		this.innPris = innPris;
	}

	public double getUtPris() {
		return utPris;
	}

	public void setUtPris(double utPris) {
		this.utPris = utPris;
	}

	public Leverandor getLeverandor() {
		return Leverandor;
	}

	public void setLeverandor(Leverandor leverandor) {
		Leverandor = leverandor;
	}

	public static int getAntProd() {
		return antProd;
	}

	public void selg(){
		
		antProd = antProd-1;
		
	}
	
}
