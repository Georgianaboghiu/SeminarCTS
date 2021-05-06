package chain.clase;

public class ContCredit extends Handler{

	public ContCredit(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold()>=suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realiza plata din contul de credit cu suma de "
					+suma);
		}else {
			super.getSuccesor().realizeazaPlata(suma);
		}
		
	}

}
