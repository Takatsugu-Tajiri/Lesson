package db;

import java.util.ArrayList;

public class UriageCheck {

	public static void main(String[] args) {
		ShouhinDAO sdao = new ShouhinDAO();
//		shouhinのsid,snameをすべて表示
		ArrayList<Shouhin> slist =sdao.findAll();
		for(Shouhin s : slist) {
			System.out.println(s.getSid()+":"+s.getSname());
		}
		System.out.println("どの売上を見たいですか？");
		int sid =new java.util.Scanner(System.in).nextInt();


		UriageDAO udao = new UriageDAO();

//		入力したsidの売上を表示
		ArrayList<Uriage> ulist = udao.findBySid(sid);
		for(Uriage u :ulist) {
			//System.out.println("aaa");
			System.out.println(u.getHi()+":"+u.getKosu()+"個");
		}


	}

}
