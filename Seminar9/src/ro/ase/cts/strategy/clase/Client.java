package ro.ase.cts.strategy.clase;

public class Client {
	private String nume;
	private ModalitatePlata modPlata;
	
	public Client(String nume) {
		super();
		this.nume = nume;
		this.modPlata=new Card();
	}
	
	public void platesteNota(double suma) {
		System.out.println("Clientul " + nume+ " are de platit nota!");
		modPlata.plateste(suma);
	}

	public void setModPlata(ModalitatePlata modPlata) {
		this.modPlata = modPlata;
	}
	
	
}
