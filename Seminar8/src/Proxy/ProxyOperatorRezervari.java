package Proxy;

public class ProxyOperatorRezervari implements IOperatoriRezervari{

	private OperatoriRezervari operator;
	private int nrMinimPersoane;
	public ProxyOperatorRezervari(OperatoriRezervari operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane=nrMinimPersoane;
	}

	@Override
	public void realizeazaRezervare(int nrPersoana) {
		if(nrPersoana>=nrMinimPersoane) {
			operator.realizeazaRezervare(nrPersoana);
		}
		else {
			System.out.println("Va rugam veniti fara rezervare");
		}
		
	}

}
