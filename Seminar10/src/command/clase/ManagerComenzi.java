package command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {

	private List<Comanda> listaComenzi;
	
	public ManagerComenzi() {
		listaComenzi=new ArrayList<>();
	}
	
	public void invoca(Comanda comanda) {
		listaComenzi.add(comanda);
	}
	
	public void executaComanda() {
		if(listaComenzi.size()>0){
			this.listaComenzi.get(0).executa();
			this.listaComenzi.remove(0);
			
		}
	}
}
