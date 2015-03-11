package varelager;
import interfa.i_obnvn;
import medlemmer.Leverandor;


public class Fisk extends LevendeProdukt implements i_obnvn{
	
	public Fisk(String navn, double innPris, double utPris, Leverandor leverandor, String slektsnavn, String artsnavn) {
		super(navn, innPris, utPris, leverandor, slektsnavn, artsnavn);
		// TODO Auto-generated constructor stub
		antFisk = antFisk + 1;
	}
	private static int antFisk = 0;
	
	public static int getAntFisk() {
		return antFisk;
	}
	
	@Override
	public void selg(){
		super.selg();
		antFisk = antFisk-1;
	}

	@Override
	public String getObnvn() {
		// TODO Auto-generated method stub
		super.getObnvn();
		return "Fisk";
	}

	
}
