package Obj;

public class Seito {
	String name;
	int kokugo;
	int sansuu;
	int syakai;
	
	public void show() {
		System.out.println(name+" "+"国語"+kokugo+"点 "+"算数"+sansuu+"点 "+"社会"+syakai+"点 ");
		}
	
	public int goukei() {
		
		return kokugo+sansuu+syakai;
	}
	
	public double heikin() {
		return (goukei())/3.;
	}
	}


