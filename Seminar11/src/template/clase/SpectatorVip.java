package template.clase;

public class SpectatorVip extends SpectatorAbstract{

	private String numeVip;
	
	public SpectatorVip(String numeVip) {
		super();
		this.numeVip = numeVip;
	}

	@Override
	public void asejareCoada() {
		System.out.println(numeVip + " se prezinta direct la usa");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(numeVip + " prezinta bilet Vip");
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(numeVip + " realizeaza control");
		
	}

	@Override
	public void intraPeStadion() {
		System.out.println(numeVip + " intra in tribuna Vip");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(numeVip + " ocupa loc in loja");
		
	}

}
