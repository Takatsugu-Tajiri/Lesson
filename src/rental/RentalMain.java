package rental;

import java.util.ArrayList;

public class RentalMain {

	public static void main(String[] args) {
		ArrayList<Item>list=new ArrayList<>();
		list.add(new Book("ワンピース",7));
		list.add(new CD("パプリカ",3));
		list.add(new CD("Lemon",1));
		
		int sum=0;
		for(Item item:list) {
			System.out.println(item);
			sum+=item.getPrice();
		}
		System.out.println(sum);
	}

}
