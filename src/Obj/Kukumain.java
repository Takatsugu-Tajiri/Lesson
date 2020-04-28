package Obj;

import java.util.ArrayList;

public class Kukumain {

	public static void main(String[] args) {

		ArrayList<KukuMondai> klist=new ArrayList<KukuMondai>();
		
		for(int i=1;i<=5;i++) {
		klist.add(new KukuMondai());
		
		}
		for( KukuMondai k : klist ) {
			k.show();
			int input =new java.util.Scanner(System.in).nextInt();
			k.check(input);
		}
		
	

	}
	

}
