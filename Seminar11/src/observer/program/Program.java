package observer.program;

import observer.clase.ClientFidel;
import observer.clase.ManagerSala;
import observer.clase.Observer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Observer c1=new ClientFidel("Gigel");
		Observer c2=new ClientFidel("Cornel");
		Observer c3=new ClientFidel("Marcel");
		Observer c4=new ClientFidel("Viorica");
		
		ManagerSala manager=new ManagerSala();
		
		manager.adaugaAbonat(c1);
		manager.adaugaAbonat(c2);
		manager.adaugaAbonat(c3);
		manager.adaugaAbonat(c4);
		
		manager.anuntaMeci("Fotbal");
		
		manager.stergeAbonat(c1);
		

		manager.anuntaMeci("Handbal");
		
	}

}
