package medlemmer;

import java.util.ArrayList;

public class Leverandor {
	private String navn;
	private String epost;
	private String adr;
	private String pNr;
	private String pSted;
	private String tlf;
	private static int antLev;
	private static ArrayList<Leverandor> leverandorliste = new ArrayList<Leverandor>();
	
	public static ArrayList<Leverandor> getLeverandorliste() {
		return leverandorliste;
	}
	
	public static int getAntLev() {
		return antLev;
	}
	
	@Override
	public String toString(){
		return navn;
	}
	
	public Leverandor(String navn, String epost, String adr, String pNr,
			String pSted, String tlf) {
		this.navn = navn;
		this.epost = epost;
		this.adr = adr;
		this.pNr = pNr;
		this.pSted = pSted;
		this.tlf = tlf;
		antLev++;
		leverandorliste.add(this);
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getEpost() {
		return epost;
	}
	public void setEpost(String epost) {
		this.epost = epost;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public String getpNr() {
		return pNr;
	}
	public void setpNr(String pNr) {
		this.pNr = pNr;
	}
	public String getpSted() {
		return pSted;
	}
	public void setpSted(String pSted) {
		this.pSted = pSted;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	

}
