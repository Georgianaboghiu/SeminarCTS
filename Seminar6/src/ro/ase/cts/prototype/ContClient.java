package ro.ase.cts.prototype;

public class ContClient implements AbstractPrototype{
private String nume;
private int varsta;

//realizam validari costisitoare
public ContClient(String nume, int varsta) {
	super();
	this.nume = nume;
	this.varsta = varsta;
}

private ContClient() {
	super();
	
}

@Override
public String toString() {
	return "ContClient [nume=" + nume + ", varsta=" + varsta + "]";
}

@Override
public AbstractPrototype copiaza() {
	ContClient client=new ContClient();
	client.nume=this.nume;
	client.varsta=this.varsta;
	return client;
}


	
}
