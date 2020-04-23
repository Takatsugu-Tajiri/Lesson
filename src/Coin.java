
public class Coin {

	public static void main(String[] args) {
		
		int[] coins = {500,100,50,10,5,1};
		
		int sum=0;

	
		for (int c :coins) {
			System.out.println(c+"円玉は何枚ですか？");
			int input =new java.util.Scanner(System.in).nextInt();
			sum=sum+c*input;
		}
		System.out.println(sum +"円");
	}
}


