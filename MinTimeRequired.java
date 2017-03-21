package coding_blocks;

import java.util.Scanner;

public class MinTimeRequired {

	public static long minimumTime(int[] array, int m) {
		int[] arr_time = new int[array.length];
		long time = 0;
		int product = 0;
		while(true) {
			time++;
			for(int i=0;i<array.length;i++) {
				arr_time[i]++;
				if(arr_time[i]==array[i]) {
					product++;
					arr_time[i]=0;
				}
				if(product == m) {
//					System.out.println(time);
					return time;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int m = s.nextInt();
		System.out.println(minimumTime(arr, m));
	}

}
