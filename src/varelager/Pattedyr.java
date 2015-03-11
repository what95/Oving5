package varelager;
import interfa.i_obnvn;
import medlemmer.Leverandor;


public class Pattedyr extends LevendeProdukt implements i_obnvn{
	public Pattedyr(String navn, double innPris, double utPris,
			Leverandor leverandor, String slektsnavn, String artsnavn) {
		super(navn, innPris, utPris, leverandor, slektsnavn, artsnavn);
		// TODO Auto-generated constructor stub
		antPattedyr = antPattedyr+1;
	}
	private static int antPattedyr = 0;
	
	public static int getAntPattedyr() {
		return antPattedyr;
	}
	@Override
	public void selg(){
		super.selg();
		antPattedyr = antPattedyr-1;
	}
	@Override
	public String getObnvn() {
		// TODO Auto-generated method stub
		super.getObnvn();
		return "Pattedyr";
	}

	
	
}
