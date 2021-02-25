package sem01_cts;

import clase.Girafe;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeeper;

public class Main {
	public static void main (String[] args){
		System.out.println("hello");
		
		Zoo zoo=new Zoo();
		Zookeeper keeper=new Zookeeper();
//	zoo.setKeeper(keeper);
	keeper.setName("Marcel");
	Zebra zebar1=new Zebra("zebra1");
	Zebra zebar2=new Zebra("zebra2");
	zoo.add(zebar1);
	zoo.add(zebar2);
zoo.feedAllAnimals();
Girafe g1=new Girafe("Lili");
Girafe g2=new Girafe("Lii");
zoo.add(g2);
zoo.add(g1);
zoo.feedAllAnimals();
	}
		}
	


