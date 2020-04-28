package Obj;

import java.util.ArrayList;

public class Seitomain {

	public static void main(String[] args) {
//		Seito s = new Seito();
//		s.name="田中";
//		s.kokugo=80;
//		s.sansuu=70;
//		s.syakai=50;
//		s.show();
//		System.out.println(s.goukei()+"点");
//		System.out.println(s.heikin()+"点");


		ArrayList<Chugakusei> clist = new ArrayList<Chugakusei>();

		clist.add(new Chugakusei("田中",90,70,80,75));
		clist.add(new Chugakusei("山田",40,90,85,55));
		clist.add(new Chugakusei("鈴木",100,50,90,60));



		for(Chugakusei ch : clist) {
			ch.showGoukei();
		}

	}

}
