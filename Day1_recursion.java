package coding_blocks;

public class Day1_recursion {
	public static int getMultiplicationofTwoNos(int a,int b) {
		if(b==1) {
			return a;
		}
		
		int ans = getMultiplicationofTwoNos(a, b-1);
		ans += a;
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(getMultiplicationofTwoNos(50, 76));
	}

}
