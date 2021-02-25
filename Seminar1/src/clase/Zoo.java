package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
private List<Animal> lista;
private Zookeeper keeper;

public Zoo(List<Animal> lista, Zookeeper keeper) {
	super();
	this.lista = lista;
	this.keeper = keeper;
}

public Zoo() {
super();
lista=new ArrayList<Animal>();
keeper=new Zookeeper();
}

public void add(Animal animal) {
	lista.add(animal);
}

public void feedAllAnimals()
{
	for(Animal animal : lista) {
		keeper.feed(animal);
	}
}

}
