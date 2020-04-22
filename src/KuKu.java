
public class KuKu {

	public static void main(String[] args) {
		int num1=new java.util.Random().nextInt(9)+1;
		int num2=new java.util.Random().nextInt(9)+1;
		int num3= num1*num2;
		System.out.println(num1 + "×" + num2 +"=");
		
		int input =new java.util.Scanner(System.in).nextInt();
		
		if (input==num3) {
			System.out.println("正解");
			
		}
		else {
			System.out.println("間違い。正解は" + num3);
		}



	}

}
