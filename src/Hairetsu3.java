
public class Hairetsu3 {

	public static void main(String[] args) {
		//int型の配列numsに8,5,9,2,4を入れる。
		//すべて表示
		//合計を表示
		//5以上の個数を表示
		//すべての要素を2倍に書き換え
		//最大値を求める

		int[] nums = { 8, 5, 9, 2, 4 };
		for (int n : nums) {
			System.out.println(n);
			
		}
		int[] points = {80,90,60,70,50};
		int sum=0;
		for (int p : points) {
			sum+=p;
		}
		System.out.println(sum);
		int count = 0;
		for (int n : nums) {
			if (n >= 5) {
				count++;
			}
		}
		System.out.println("5以上の個数は" + count);
		
		for(int i=0 ; i<5 ; i++){
			nums[i] =nums[i]*2;
			System.out.println(nums[i]);
		}
		int max =0;
		for(int n :nums ) {
			max =Math.max(max, n);
			
			
		}System.out.println(max);
		
	}

}
