package Obj;

public class Seito {
	String name;
	int kokugo;
	int sansuu;
	int syakai;

	public Seito(String name,int kokugo,int sansuu,int syakai) {
		this.name=name;
		this.kokugo=kokugo;
		this.sansuu=sansuu;
		this.syakai=syakai;
	}

	public void show() {
		System.out.println(this.name+" "+"国語"+this.kokugo+"点 "+"算数"+this.sansuu+"点 "+"社会"+this.syakai+"点 ");
		}

	public int goukei() {

		return kokugo+sansuu+syakai;
	}

	public double heikin() {
		return (goukei())/3.;
	}
	}


