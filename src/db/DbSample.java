package db;

import java.util.ArrayList;

public class DbSample {

	public static void main(String[] args) {
		//insert("なし",90);
		//		update(7,"かき",100);
		//		select();
		//		find(3);
		//		ShouhinDAO dao =new ShouhinDAO();
		//		dao.findBySid(3);
		//		Shouhin s= new Shouhin(0,"バナナ",110);
		//		dao.update(s);
		//		dao.insert(s);

		//		Shouhin s= dao.findBySid(3);
		//		System.out.println(s.getSname());
		//		dao.delete(9);
		//		ArrayList<Shouhin> list = dao.findAll();
		//		for( Shouhin s : list ) {
		//			System.out.println(s.getSname());

		UriageDAO dao1 = new UriageDAO();

		//		Uriage u=dao1.findByUid(1);
		//		System.out.println(u.getHi());

		ArrayList<Uriage> ulist = dao1.findAll();
		for (Uriage u : ulist) {
			System.out.println(u.getHi());
		}
	}

}
