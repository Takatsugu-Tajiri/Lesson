
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int  tuki = 4;
		int hi = 22;

		System.out.println("今日は" + tuki +"月" +hi + "日" );

		Double P = 3.14;
		System.out.println("円周率は" + P + "です。");
		
		int a;
		int b;
		a=20;
		b=a+5;
		System.out.println(a);
		System.out.println(b);
		System.out.println("今日は\"4月\"です");
		System.out.println("\\100");
		System.out.println("c:\\に\"フォルダ\"を作成");
		
		int num = 10;
		int amari = 10%3;					//10を3で割ったあまり
		System.out.println(amari);
		
		num++;
		num +=1;
		
		System.out.println(num);
		
		
		
		int kokugo =70;
		int sannsuu =75;
		double heikin = (kokugo+sannsuu)/2.0;
		System.out.println(heikin);
		
		int num1=3;
		int num2=5;
		System.out.println ("足し算の結果は" +(num1+num2));
		
		System.out.print("私は");
		System.out.print("たじり");
		System.out.println("です");
		
		int m = Math.max(10, 20);
		System.out.println(m);
		
		String age ="31";
		int nAge =Integer.parseInt(age);
		System.out.println(age+1);
		
		int r = new java.util.Random().nextInt(90);
		System.out.println(r);
		
		//さいころ　１から６までの乱数
		
		int saikoro = new java.util.Random().nextInt(6)+1;
		System.out.println(saikoro);
					
		
	}

}
