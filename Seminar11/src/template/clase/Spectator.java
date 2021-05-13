package template.clase;

public class Spectator extends SpectatorAbstract{

	private String nume; 
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asejareCoada() {
		System.out.println("Spectatorul " +this.nume+ " s-a asejat la coada");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println("Spectatorul " +this.nume+ " prezinta bilet");
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("Spectatorul " +this.nume+ " a fost controlat corporal");
		
	}

	@Override
	public void intraPeStadion() {
		System.out.println("Spectatorul " +this.nume+ " a intrat pe stadion");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spectatorul " +this.nume+ " va ocupa locul");
		
	}

}
