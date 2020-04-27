package Obj;

public class KujiChecker {
	int kingaku;

	public void check(Kuji k) {
		if(k.bangou==123456) {
			k.kekka="1等";
			kingaku+=100000;

		}
		else if(k.bangou%100==12) {
			k.kekka="2等";
			kingaku+=1000;

		}
		else {
			k.kekka="はずれ";
		}
	}

}
