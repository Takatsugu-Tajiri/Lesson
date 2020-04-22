
public class IfSample {

	public static void main(String[] args) {
	
		System.out.println("数字を入力:");
		int num =new java.util.Scanner(System.in).nextInt();
		//80点以上は評価A、60点以上は評価B,59点以下は評価C
		if (num>=80) {
			System.out.println("評価A");
		} else if (num>=60 )	{
			System.out.println("評価B");
		} else {
			System.out.println("評価C");
		}

	}

}
