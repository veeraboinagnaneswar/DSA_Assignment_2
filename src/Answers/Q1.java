package Answers;
import java.util.*;

class FindMaxPair{
	public int maxSum(int[]arr) {
		int sum=0;
		//Arrays.sort(arr);
		arr=sort(arr);
		for(int i=1;i<arr.length;i+=2) {
			sum+=Math.min(arr[i], arr[i-1]);
		}
		
		return sum;
	}
	public static int[] sort(int[] arr) {
		boolean b;
		for(int i=0;i<arr.length;i++) {
			b=false;
			for(int j=1;j<=arr.length-i-1;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					b=true;
				}
			}
			if(b==false) {
				break;
			}
		}
		return arr;
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,4,3,2};
		FindMaxPair fmp=new FindMaxPair();
		int s=fmp.maxSum(arr);
		System.out.println(s);
	}

}
