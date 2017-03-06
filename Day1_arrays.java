package coding_blocks;

public class Day1_arrays {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] pushAllZerosToEnd(int[] arr) {
		int [] ans = new int[arr.length];
		int index=0;
		for(int num : arr) {
			if(num!=0) {
				ans[index]=num;
				index++;
			}
		}
		for(int i=index;i<ans.length;i++) {
			ans[index] = 0;
			index++;
		}
		return ans;
	}
	
	public static int getKInClockwiseRotatedArray(int[] arr) {
		int prev = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			if(num>=prev) {
				prev = num;
			} else {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void getSortedArrayInOneScan(int[] arr) {
		int begin=0;
		int end=arr.length-1;
		while(begin<=end) {
			if(arr[begin]==1) {
				while(true) {
					if(arr[end]==0) {
						int temp = arr[begin];
						arr[begin]=arr[end];
						arr[end]=temp;
						begin++;
						end--;
						break;
					} else {
						end--;
					}
				}
			} else {
				begin++;
			}
		}
	}
	
	public static void swap(int i,int j,int[] arr) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void getSortedArrayOfZeroOneTwo(int[] arr) {
		int zero = 0;
		int one = 1;
		int two = arr.length-1;
		int index = 0;
		while(true) {
			int num = arr[index];
			if(num==0) {
				if(index!=zero) {
					swap(index,zero,arr);
				} else {
					index++;
				}
				zero++;
			} else if(num==1) {
				if(index!=one) {
					swap(index,one,arr);
				} else {
					index++;
				}
				one++;
			} else if(num==2) {
				if(index!=two) {
					swap(index,two,arr);
				} else {
					index++;
				}
				two--;
			}
			if(index>two) {
				break;
			}
		}
		printArray(arr);
	}
	
	public static int getMultiplicationofTwoNos(int a,int b) {
		if(b==1) {
			return a;
		}
		
		int ans = getMultiplicationofTwoNos(a, b-1);
		ans += a;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {2,1,0};
//		printArray(pushAllZerosToEnd(arr));
//		System.out.println();
//		System.out.println(getKInClockwiseRotatedArray(arr));
//		getSortedArrayInOneScan(arr);
//		printArray(arr);
//		getSortedArrayOfZeroOneTwo(arr);
		System.out.println(getMultiplicationofTwoNos(50, 76));
	}

}
