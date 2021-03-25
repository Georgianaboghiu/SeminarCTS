package ro.ase.cts.clase;

public class Bagaj {
	private int cod;
	private String detinator;
	private float greutate;
	
	private static Bagaj bagaj=null;
	
	
	private Bagaj(int cod, String detinator, float greutate)
	{

		this.cod = cod;
		this.detinator = detinator;
		this.greutate = greutate;
	}
	
	public static synchronized Bagaj getInstance(int cod, 
			String detinator, float greutate)
	{
		if(bagaj==null)
		{
		bagaj=new Bagaj(cod, detinator, greutate);
		}
		return bagaj;
	}

	public void setCod(int cod) 
	{
		this.cod = cod;
	}

	public void setDetinator(String detinator) 
	{
		this.detinator = detinator;
	}

	public void setGreutate(float greutate)
	{
		this.greutate = greutate;
	}

	@Override
	public String toString()
	{
		return "Bagaj [cod=" + cod + ", detinator=" + detinator + ", greutate=" + greutate + "]";
	}


}
