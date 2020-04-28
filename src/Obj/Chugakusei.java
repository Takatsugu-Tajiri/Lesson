package Obj;

public class Chugakusei extends Seito {
	int eigo;

	public Chugakusei(String name,int kokugo,int sansuu,int syakai,int eigo) {
		super(name,kokugo,sansuu,syakai);
		this.eigo=eigo;
	}

	public void showGoukei() {

		System.out.println(super.goukei()+this.eigo);


	}

}
