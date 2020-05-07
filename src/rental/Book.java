package rental;

public class Book extends Item{
	int price1;

	public Book(String name, int days) {
		super(name, days);
		
	}

	@Override
	int getPrice() {

		return days*50;
	}


}
