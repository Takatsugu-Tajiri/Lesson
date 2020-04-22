
public class KuKu {

	public static void main(String[] args) {
		int r=new java.util.Random().nextInt(9)+1;
		int s=new java.util.Random().nextInt(9)+1;
		
		System.out.println(r + "×" + s +"=");
		
		int input =new java.util.Scanner(System.in).nextInt();
		
		if (input==r*s) {
			System.out.println("正解");
			
		}
		else {
			System.out.println("間違い。正解は" + r*s);
		}



	}

}
