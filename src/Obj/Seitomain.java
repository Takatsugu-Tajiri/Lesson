package Obj;

public class Seitomain {

	public static void main(String[] args) {
		Seito s = new Seito();
		s.name="田中";
		s.kokugo=80;
		s.sansuu=70;
		s.syakai=50;
		s.show();
		System.out.println(s.goukei()+"点");
		System.out.println(s.heikin()+"点");
	}

}
