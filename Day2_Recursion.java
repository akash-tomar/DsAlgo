package coding_blocks;

public class Day2_Recursion {

	public static String[] getSubsequences(String str) {
		if(str.length()==0) {
			String[] arr = new String[1];
			arr[0]="";
			return arr;
		}
		if(str.length()==1) {
			String[] arr = new String[2];
			arr[0]="";
			arr[1]=str;
			return arr;
		}
		String[] sub_output = getSubsequences(str.substring(1));
		String[] output = new String[sub_output.length*2];
		int index = 0;
		for(int j=0;j<2;j++) {
			for(int i=0;i<sub_output.length;i++) {
				if(j==1) {
					output[index]=str.charAt(0)+sub_output[i];
				} else {
					output[index]=sub_output[i];
				}
				index++;
			}
		}
		return output;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ans = getSubsequences("abcdhashas");
		for(String str:ans) {
			System.out.println(str);
		}
	}

}
