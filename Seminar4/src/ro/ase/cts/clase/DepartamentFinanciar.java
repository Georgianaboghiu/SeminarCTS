package ro.ase.cts.clase;

public class DepartamentFinanciar {
	
	private int nrAangajati;
	private String director;
	private double salariuDeBaza;
	
	private static DepartamentFinanciar departamentFinanciar=null;
			
	
	private DepartamentFinanciar(int nrAangajati, String director, double salariuDeBaza)
	{
		super();
		this.nrAangajati = nrAangajati;
		this.director = director;
		this.salariuDeBaza = salariuDeBaza;
	}
	
	public static synchronized DepartamentFinanciar getInstance(int nrAangajati, String director,
			double salariuDeBaza)
	{
		if(departamentFinanciar==null) {
			departamentFinanciar=
			new DepartamentFinanciar(nrAangajati, director, salariuDeBaza);
		}
		return departamentFinanciar;
	}

	@Override
	public String toString() {
		return "DepartamentFinanciar [nrAangajati=" + nrAangajati + ", director=" + director + ", salariuDeBaza="
				+ salariuDeBaza + "]";
	}

	public void setNrAangajati(int nrAangajati) {
		this.nrAangajati = nrAangajati;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setSalariuDeBaza(double salariuDeBaza) {
		this.salariuDeBaza = salariuDeBaza;
	}
	
	

}
