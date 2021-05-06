package chain.clase;

public class ContEconomii extends Handler{

	public ContEconomii(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold()>=suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realiza plata din contul de economii cu suma de "
					+suma);
		}else {
			super.getSuccesor().realizeazaPlata(suma);
		}
		
	}

}
