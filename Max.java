import java.util.*;
class Max{


	public static void main(String[] args) {

		int[] a={-5,5,9,4,1,65,42,66};       //nlogn
		// 1st logic 
		int n=a.length;
		// Arrays.sort(a);
		// System.out.println(a[n-1]);

		//2nd 
		int min=Integer.MIN_VALUE;
		for (int i=0;i<n ;i++) {
			if(a[i]>min){
				min=a[i];
			}
			
		}
		System.out.println(min);







		
	}
}