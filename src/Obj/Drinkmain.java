package Obj;

import java.util.ArrayList;

public class Drinkmain {

	public static void main(String[] args) {
ArrayList<Drink> dlist = new ArrayList<Drink>();
		
		dlist.add(new Drink("コーラ",150));
		dlist.add(new Drink("サイダー",500));
		dlist.add(new Drink("コーヒー",500));
		
		int sum=0;
		
		for(Drink n : dlist) {
			n.show();
			sum+=n.amount;
		}
		System.out.println(sum+"ml");
		
	}
	

}
