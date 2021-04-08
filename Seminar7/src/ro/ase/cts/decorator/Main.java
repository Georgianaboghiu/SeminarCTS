package ro.ase.cts.decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardAbstract card=new Card("Ionescu");
		card.realizeazaPlataNormala();
		card.realizeazaPlataOnline();
		System.out.println(" ");
		DecoratorAbstract decoratorAbstract=new DecoratorContactless(card);
		decoratorAbstract.realizeazaPlataContactless();
		decoratorAbstract.realizeazaPlataNormala();
		decoratorAbstract.realizeazaPlataOnline();
	}

}
