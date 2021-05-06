package chain.clase;

public class ContCurent extends Handler{

	public ContCurent(float sold) {
		super(sold);
		
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold()>=suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realiza plata din contul curent cu suma de "
					+suma);
		}else {
			super.getSuccesor().realizeazaPlata(suma);
		}
		
	}

	
}
