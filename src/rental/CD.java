package rental;

public class CD extends Item{
	

	public CD(String name, int days) {
		super(name, days);
		
	}

	@Override
	int getPrice() {
		
		if(days==1) {
			return 300;
		}
		 else {
			 int sum=300;
			 return sum=300+(days-1)*100;
		}
	}
	

}
