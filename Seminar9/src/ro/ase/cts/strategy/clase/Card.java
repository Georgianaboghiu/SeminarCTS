package ro.ase.cts.strategy.clase;

public class Card implements ModalitatePlata{

	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("a fost realizata plata cu cardul pentru suma de " + sumaPlatita);
		
	}

}
