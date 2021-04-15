package ro.ase.cts.clase;
import java.util.ArrayList;
import java.util.List;
public class Sectiune implements ComponentaAbstracta{

	private String denumire;
	List<ComponentaAbstracta> optiuni;
	@Override
	public void afiseazaDescriere() {
		// TODO Auto-generated method stub
		System.out.println("Sectiunea "+denumire);
		for(ComponentaAbstracta optiune:optiuni){
			optiune.afiseazaDescriere();
		}
	}
	@Override
	public void addComponenta(ComponentaAbstracta componentaAbstracta) {
		// TODO Auto-generated method stub
		optiuni.add(componentaAbstracta);
		
	}
	@Override
	public void stergeComponenta(ComponentaAbstracta componentaAbstracta) {
		// TODO Auto-generated method stub
		optiuni.remove(componentaAbstracta);
		
	}
	@Override
	public ComponentaAbstracta getComponenta(int pozitie) {
		// TODO Auto-generated method stub
	if(pozitie>0 && pozitie< optiuni.size()) {
		return optiuni.get(pozitie);
	}
	return null;
	}
	public Sectiune(String denumire) {
		super();
		this.denumire = denumire;
		optiuni=new ArrayList<>();
	}
	
	
}
