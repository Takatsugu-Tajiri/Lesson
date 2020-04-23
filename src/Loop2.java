
public class Loop2 {

	public static void main(String[] args) {
		//1.こんにちは　と5回表示
		//2. 1 2 3 4 5と表示
		//3. numに数を入れて0からnumまで表示
		//4. 10以下の偶数を表示
		//5. 5 4 3 2 1 と表示
		for (int i=1 ; i<=5 ; i++ ) {
			System.out.println("こんにちは");
		}
		for (int i=1 ; i<=5 ; i++ ) {
				System.out.println(i);	
			}
		int num =new java.util.Scanner(System.in).nextInt();
		
		for (int i =0;i<=num;i++ ) {
			System.out.println(i);	
		}
		for (int i=1 ; i<=5 ; i++ ) {
			System.out.println(2*i);
		}
		for (int i=5 ; i>=1 ; i-- ) {
			System.out.println(i);
		}
	}

}
