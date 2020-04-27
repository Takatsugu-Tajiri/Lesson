package Obj;

public class Kujimain {

	public static void main(String[] args) {
		Kuji K1 =new Kuji();
		K1.bangou=123456;
	
		Kuji K2 =new Kuji();
		K2.bangou=101012;
		
		Kuji K3 =new Kuji();
		K3.bangou=654321;
		
		KujiChecker kc =new KujiChecker();
		kc.check(K1);
		kc.check(K2);
		kc.check(K3);
				
		K1.show();
		K2.show();
		K3.show();
		
		System.out.println(kc.kingaku);

	}

}
