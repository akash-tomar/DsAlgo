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
	
	public static double getSumOfGP(int k) {
		if(k==0) {
			return 1;
		}
		double ans = 1/Math.pow(2, k);
		ans+=getSumOfGP(k-1);
		return ans;
	}
	public static boolean isPallindrome(String str) {
		if(str.length()==1) {
			return true;
		} else if(str.length()==0) {
			return true;
		}
		
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			return isPallindrome(str.substring(1, str.length()-1));
		} else {
			return false;
		}	
	}
	
	public static String changePiToNum(String str) {
		if(str.length()==1) {
			return str;
		}
		String ans;
		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
			ans = "3.14";
			if(str.length()>2) {
				ans+=changePiToNum(str.substring(2, str.length()));
			}
		} else {
			ans = str.charAt(0)+"";
			if(str.length()>1) {
				ans += changePiToNum(str.substring(1,str.length()));
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(getMultiplicationofTwoNos(50, 76));
		System.out.println(countNumberOfZerosInNumber("0000090910910909182901"));
		System.out.println(getSumOfGP(5));
		System.out.println(isPallindrome("hannah"));
		System.out.println(changePiToNum("pipikjbDKJbpijbjpipip"));
	}
}
