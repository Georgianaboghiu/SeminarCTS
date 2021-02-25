package clase;

public class Zookeeper {
	
	private String name;

	public Zookeeper() {
		super();
//		this.name = name;
	}

	public void feed(Animal animal) {
		// TODO Auto-generated method stub
		System.out.println(name + " "+animal.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
