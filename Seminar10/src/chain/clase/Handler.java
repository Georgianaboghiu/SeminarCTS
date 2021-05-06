package chain.clase;

public abstract class Handler {

	private Handler succesor;
	private float sold;
	
	public Handler( float sold) {
		super();
		this.succesor = null;
		this.sold = sold;
	}

	public Handler getSuccesor() {
		return succesor;
	}

	public void setSuccesor(Handler succesor) {
		this.succesor = succesor;
	}

	public float getSold() {
		return sold;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}
	
	public abstract void realizeazaPlata(float suma);
}
