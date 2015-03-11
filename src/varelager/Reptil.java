package varelager;
import interfa.i_obnvn;
import medlemmer.Leverandor;


public class Reptil extends LevendeProdukt implements i_obnvn{
	public Reptil(String navn, double innPris, double utPris,
			Leverandor leverandor, String slektsnavn, String artsnavn) {
		super(navn, innPris, utPris, leverandor, slektsnavn, artsnavn);
		antReptiler = antReptiler+1;
	}
	private static int antReptiler = 0;
	
	
	public static int getAntReptiler() {
		return antReptiler;
	}
	@Override
	public void selg(){
		super.selg();
		antReptiler = antReptiler-1;
	}
	@Override
	public String getObnvn() {
		// TODO Auto-generated method stub
		super.getObnvn();
		return "Reptil";
	}
}
