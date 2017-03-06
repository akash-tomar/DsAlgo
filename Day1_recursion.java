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
	
	public static int countNumberOfZerosInNumber(String number) {
		String num = number+"";
		int ans=0;
		if(num.charAt(0)=='0') {
			ans+=1;
		}
		if(num.length()!=1) {
			ans+=countNumberOfZerosInNumber(num.substring(1));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(getMultiplicationofTwoNos(50, 76));
		System.out.println(countNumberOfZerosInNumber("0000090910910909182901"));
	}
}
